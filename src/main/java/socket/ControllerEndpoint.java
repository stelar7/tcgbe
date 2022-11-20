package socket;

import com.google.gson.*;
import game.*;
import game.basic.GameCard;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

@ServerEndpoint(value = "/game", decoders = MessageCoder.class, encoders = MessageCoder.class)
public class ControllerEndpoint
{
    private static final Gson gson = new Gson();
    
    public static String assetToken = "ABC-123";
    
    private static final Map<String, JsonElement> cardCache    = new HashMap<>();
    private static final List<PacketType>         nonAuthTypes = List.of(PacketType.CARD_DATA, PacketType.LOGIN);
    
    private static final Map<String, String>      allowedLogins = Map.of("stelar7", "steffen1", "gandlaf", "gandlaf");
    private static final Queue<String>            matchmaking   = new ArrayDeque<>();
    private static final Map<String, UserSession> sessionUsers  = new HashMap<>();
    private static final Map<String, Game>        sessionGames  = new HashMap<>();
    
    private static final String assetPath = "C:\\Users\\stelar7\\Desktop\\digimon\\assets\\data";
    
    static
    {
        JsonObject object = new JsonObject();
        JsonArray  items  = new JsonArray();
        try (Stream<Path> paths = Files.walk(Paths.get(assetPath)))
        {
            paths.forEach(p -> {
                if (Files.isDirectory(p))
                {
                    return;
                }
                
                try
                {
                    String      content = Files.readString(p);
                    JsonElement val     = JsonParser.parseString(content);
                    
                    String card_code = val.getAsJsonObject().get("card_number").getAsString();
                    val.getAsJsonObject().addProperty("set", card_code.split("-")[0]);
                    
                    cardCache.put(card_code, val);
                    items.add(val);
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        
        cardCache.put("all", items);
    }
    
    
    @OnOpen
    public void onOpen(Session session)
    {
        System.out.println("open");
    }
    
    @OnMessage
    public void onMessage(Session session, Packet packet)
    {
        System.out.println("Received from: " + session.getId() + " - " + packet);
        
        if (!sessionUsers.containsKey(session.getId()) && !nonAuthTypes.contains(packet.getType()))
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
        if (!cardCache.containsKey(key))
        {
            return;
        }
        
        sendPacket(session, PacketType.CARD_DATA, Map.of("item", cardCache.get(key)));
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
            // TODO: get deck from user
            
            String         selfId      = session.getId();
            UserSession    selfSession = sessionUsers.get(selfId);
            List<GameCard> deck        = IntStream.range(1, 51).mapToObj(i -> new Gson().fromJson(cardCache.get("BT1-001"), GameCard.class)).toList();
            GamePlayer     playerSelf  = new GamePlayer(selfSession, deck);
            
            String         otherId      = matchmaking.remove();
            UserSession    otherSession = sessionUsers.get(otherId);
            List<GameCard> deck2        = IntStream.range(1, 51).mapToObj(i -> new Gson().fromJson(cardCache.get("BT1-001"), GameCard.class)).toList();
            GamePlayer     otherPlayer  = new GamePlayer(otherSession, deck2);
            
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
            
            UserSession other = sessionUsers.get(opponent);
            if (other != null)
            {
                sendPacket(other.session(), PacketType.GAME_WIN, Map.of());
            }
        }
    }
    
    private void sendPacket(Session to, PacketType type, Map<String, Object> data)
    {
        try
        {
            Packet packet = new Packet(type, data);
            System.out.println("Sending to: " + to.getId() + " - " + packet);
            to.getBasicRemote().sendObject(packet);
        } catch (IOException | EncodeException e)
        {
            throw new RuntimeException(e);
        }
    }
    
}
