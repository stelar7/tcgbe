import org.eclipse.jetty.websocket.client.WebSocketClient;

import java.net.URI;

public class GameTest
{
    public static void main(String[] args) throws Exception
    {
        connectClient();
        connectClient();
    }
    
    private static void connectClient() throws Exception
    {
        WebSocketClient client = new WebSocketClient();
        client.setMaxTextMessageSize(65535);
        client.start();
        
        GameClientEndpoint endpoint = new GameClientEndpoint();
        URI                server   = URI.create("ws://localhost:8081/game");
        
        client.connect(endpoint, server);
    }
}
