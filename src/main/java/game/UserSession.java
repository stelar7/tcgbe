package game;

import game.enums.GameEvent;
import socket.*;

import javax.websocket.*;
import java.io.IOException;
import java.util.*;

public record UserSession(Session session, String username)
{
    public void emitEvent(GameEvent event, Map<String, String> meta)
    {
        try
        {
            Map<String, Object> data = new LinkedHashMap<>();
            data.put("event", event);
            meta.forEach((k, v) -> data.merge(k, v, (val1, val2) -> val2));
            
            Packet packet = new Packet(PacketType.GAME_ACTION, data);
            System.out.println("Sending to: " + session.getId() + " - " + packet);
            
            session.getBasicRemote().sendObject(packet);
        } catch (IOException | EncodeException e)
        {
            throw new RuntimeException(e);
        }
    }
};
