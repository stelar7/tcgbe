package socket;

import java.util.*;

public class Packet
{
    private PacketType          type;
    private Map<String, Object> data;
    
    public Packet(PacketType type, Map<String, Object> data)
    {
        this.type = type;
        this.data = data;
    }
    
    public PacketType getType()
    {
        return type;
    }
    
    public void setType(PacketType type)
    {
        this.type = type;
    }
    
    public Map<String, Object> getData()
    {
        return data;
    }
    
    public void setData(Map<String, Object> data)
    {
        this.data = data;
    }
    
    @Override
    public String toString()
    {
        return "Packet{" +
               "type=" + type +
               ", data=" + data +
               '}';
    }
}

