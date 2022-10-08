import com.google.gson.Gson;
import game.enums.GameState;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.*;
import socket.*;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Random;

@WebSocket
public class GameClientEndpoint
{
    @OnWebSocketConnect
    public void onWebSocketConnect(Session session) throws IOException
    {
        session.setIdleTimeout(Duration.of(1, ChronoUnit.DAYS));
        session.getRemote().sendString("""
                                               {"type": "LOGIN", "data": {"username": "gandlaf", "password": "gandlaf"}}
                                               """);
        session.getRemote().sendString("""
                                               {"type": "QUEUE", "data": {}}
                                               """);
    }
    
    @OnWebSocketClose
    public void onWebSocketClose(int statusCode, String reason)
    {
        System.out.println("close");
    }
    
    @OnWebSocketError
    public void onWebSocketError(Throwable cause)
    {
        System.out.println("error");
        if (!(cause instanceof ClosedChannelException))
        {
            cause.printStackTrace();
        }
    }
    
    @OnWebSocketMessage
    public void onWebSocketText(Session session, String message) throws IOException
    {
        System.out.println(message);
        
        Packet packet = new Gson().fromJson(message, Packet.class);
        
        if (packet.getType() == PacketType.GAME_START)
        {
            session.getRemote().sendString("""
                                                   {"type": "GAME_ACTION", "data": {}}
                                                   """);
            return;
        }
        
        if (packet.getType() == PacketType.GAME_ACTION)
        {
            if (packet.getData().get("event").equals("STATE_CHANGE") && packet.getData().get("state").equals(GameState.MULLIGAN.toString()))
            {
                boolean mulligan = new Random().nextBoolean();
                String  choice   = mulligan ? "yes" : "no";
                session.getRemote().sendString("""
                                                       {"type": "GAME_ACTION", "data": {"action": "%s"}}
                                                       """.formatted(choice));
            }
        }
    }
}
