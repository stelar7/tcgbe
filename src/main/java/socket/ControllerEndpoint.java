package socket;

import com.google.gson.*;
import game.Game;
import game.GamePlayer;
import game.UserSession;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Stream;

@ServerEndpoint(value = "/game", decoders = MessageCoder.class, encoders = MessageCoder.class)
public class ControllerEndpoint {
    private static final Gson gson = new Gson();

    public static String assetToken = "ABC-123";
    private static JsonObject allCache = null;

    private static final Map<String, UserSession> sessionUsers = new HashMap<>();
    private static final Map<String, String> allowedLogins = Map.of("stelar7", "steffen1", "gandlaf", "gandlaf");
    private static final Map<String, Game> sessionGames = new HashMap<>();


    @OnOpen
    public void onOpen(Session session) throws IOException, EncodeException {
        System.out.println("open");
    }

    @OnMessage
    public void onMessage(Session session, Packet packet) throws IOException, EncodeException {
        System.out.println(packet);

        switch (packet.getType()) {
            case LOGIN -> {
                String username = (String) packet.getData().get("username");
                String expectedPassword = allowedLogins.get(username);
                String actualPassword = (String) packet.getData().get("password");

                if (expectedPassword == null) {
                    sendPacket(session, PacketType.LOGIN, Map.of("error", "Invalid login"));
                    return;
                }

                if (expectedPassword.equals(actualPassword)) {
                    sessionUsers.put(session.getId(), new UserSession(session, username));
                    sendPacket(session, PacketType.LOGIN, Map.of("ok", "Logged in", "token", assetToken));
                }
            }

            case CARD_DATA -> {
                String key = (String) packet.getData().getOrDefault("key", "");
                if ("all".equals(key)) {
                    if (allCache != null) {
                        sendPacket(session, PacketType.CARD_DATA, Map.of("item", allCache));
                        return;
                    }

                    JsonObject object = new JsonObject();
                    JsonArray items = new JsonArray();
                    try (Stream<Path> paths = Files.list(Paths.get("C:\\Users\\stelar7\\Desktop\\digimon\\assets\\data"))) {
                        paths.forEach(p -> {
                            try {
                                String content = Files.readString(p);
                                JsonElement val = JsonParser.parseString(content);
                                items.add(content);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
                    }

                    object.addProperty("key", key);
                    object.add("value", items);
                    allCache = object;

                    sendPacket(session, PacketType.CARD_DATA, Map.of("item", object));
                }
            }

            case QUEUE -> {
                 // TODO: Create a new game
            }

            case GAME_ACTION -> {
                Game game = sessionGames.get(session.getId());
                GamePlayer player = game.getPlayer(session.getId());
                game.runCommand(player, packet.getData());
            }
        }
    }

    @OnClose
    public void onClose(Session session) throws IOException, EncodeException {
        sessionUsers.remove(session.getId());
        System.out.println("closed");
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        throwable.printStackTrace();
    }

    private void sendPacket(Session to, PacketType type, Map<String, Object> data) throws EncodeException, IOException {
        Packet packet = new Packet(type, data);
        to.getBasicRemote().sendObject(packet);
    }

}
