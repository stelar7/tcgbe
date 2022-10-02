package game;

import game.enums.GameEvent;

import javax.websocket.Session;
import java.util.Map;

public record UserSession(Session session, String username)
{
    public void emitEvent(GameEvent event, Map<String, String> meta)
    {
    
    }
};
