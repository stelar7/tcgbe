package socket;

import com.google.gson.*;
import game.*;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

@ServerEndpoint(value = "/game", decoders = MessageCoder.class, encoders = MessageCoder.class)
public class ControllerEndpoint
{
    private static final Gson gson = new Gson();
    
    public static  String     assetToken = "ABC-123";
    private static JsonObject allCache   = null;
    
    private static final Map<String, String>      allowedLogins = Map.of("stelar7", "steffen1", "gandlaf", "gandlaf");
    private static final Queue<String>            matchmaking   = new ArrayDeque<>();
    private static final Map<String, UserSession> sessionUsers  = new HashMap<>();
    private static final Map<String, Game>        sessionGames  = new HashMap<>();
    
    private static final String assetPath = "C:\\Users\\stelar7\\Desktop\\digimon\\assets\\data";
    
    
    @OnOpen
    public void onOpen(Session session)
    {
        System.out.println("open");
    }
    
    @OnMessage
    public void onMessage(Session session, Packet packet)
    {
        System.out.println(packet);
        
        if (!sessionUsers.containsKey(session.getId()) && packet.getType() != PacketType.LOGIN)
        {
            sendPacket(session, PacketType.LOGIN, Map.of("error", "Login first!"));
            return;
        }
        
        switch (packet.getType())
        {
            case LOGIN -> handleLogin(session, packet.getData());
            case CARD_DATA -> handleCardData(session, packet.getData());
            case QUEUE -> handleMatchmaking(session);
            case GAME_ACTION -> handleGameAction(session, packet.getData());
        }
    }
    
    @OnClose
    public void onClose(Session session)
    {
        handleUserQuit(session);
        System.out.println("closed");
    }
    
    @OnError
    public void onError(Session session, Throwable throwable)
    {
        throwable.printStackTrace();
    }
    
    private void handleLogin(Session session, Map<String, Object> data)
    {
        String username       = (String) data.get("username");
        String actualPassword = (String) data.get("password");
        
        String expectedPassword = allowedLogins.get(username);
        if (expectedPassword == null)
        {
            sendPacket(session, PacketType.LOGIN, Map.of("error", "Invalid login"));
            return;
        }
        
        if (expectedPassword.equals(actualPassword))
        {
            sessionUsers.put(session.getId(), new UserSession(session, username));
            sendPacket(session, PacketType.LOGIN, Map.of("ok", "Logged in", "token", assetToken));
        }
    }
    
    private void handleCardData(Session session, Map<String, Object> data)
    {
        String key = (String) data.getOrDefault("key", "");
        if ("all".equals(key))
        {
            if (allCache != null)
            {
                sendPacket(session, PacketType.CARD_DATA, Map.of("item", allCache));
                return;
            }
            
            JsonObject object = new JsonObject();
            JsonArray  items  = new JsonArray();
            try (Stream<Path> paths = Files.list(Paths.get(assetPath)))
            {
                paths.forEach(p -> {
                    try
                    {
                        String      content = Files.readString(p);
                        JsonElement val     = JsonParser.parseString(content);
                        items.add(content);
                    } catch (IOException e)
                    {
                        throw new RuntimeException(e);
                    }
                });
            } catch (IOException e)
            {
                throw new RuntimeException(e);
            }
    
            object.addProperty("key", key);
            object.add("value", items);
            allCache = object;
            
            sendPacket(session, PacketType.CARD_DATA, Map.of("item", object));
        }
    }
    
    private void handleGameAction(Session session, Map<String, Object> data)
    {
        Game       game   = sessionGames.get(session.getId());
        GamePlayer player = game.getPlayer(session.getId());
        game.runCommand(player, data);
    }
    
    private synchronized void handleMatchmaking(Session session)
    {
        if (matchmaking.contains(session.getId()))
        {
            return;
        }
        
        if (matchmaking.size() > 0)
        {
            String otherId = matchmaking.remove();
            String selfId  = session.getId();
            
            UserSession selfSession  = sessionUsers.get(selfId);
            UserSession otherSession = sessionUsers.get(otherId);
            
            GamePlayer playerSelf  = new GamePlayer(selfSession, List.of());
            GamePlayer otherPlayer = new GamePlayer(otherSession, List.of());
            
            Game game = new Game(playerSelf, otherPlayer);
            sessionGames.put(selfId, game);
            sessionGames.put(otherId, game);
            
            sendPacket(selfSession.session(), PacketType.GAME_START, Map.of());
            sendPacket(otherSession.session(), PacketType.GAME_START, Map.of());
        } else
        {
            matchmaking.add(session.getId());
            sendPacket(session, PacketType.MATCHMAKING, Map.of());
        }
    }
    
    private void handleUserQuit(Session session)
    {
        matchmaking.remove(session.getId());
        sessionUsers.remove(session.getId());
        
        if (sessionGames.containsKey(session.getId()))
        {
            Game   target   = sessionGames.remove(session.getId());
            String opponent = null;
            for (Entry<String, Game> entry : sessionGames.entrySet())
            {
                if (entry.getValue().equals(target))
                {
                    opponent = entry.getKey();
                }
            }
            
            sessionGames.remove(opponent);
            
            Session opponentSession = sessionUsers.get(opponent).session();
            sendPacket(opponentSession, PacketType.GAME_WIN, Map.of());
        }
    }
    
    private void sendPacket(Session to, PacketType type, Map<String, Object> data)
    {
        try
        {
            Packet packet = new Packet(type, data);
            to.getBasicRemote().sendObject(packet);
        } catch (IOException | EncodeException e)
        {
            throw new RuntimeException(e);
        }
    }
    
}
