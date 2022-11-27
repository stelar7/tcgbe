package game.socket;

import com.google.gson.Gson;

import javax.websocket.*;

public class MessageCoder implements Encoder.Text<Packet>, Decoder.Text<Packet>
{
    private static final Gson gson = new Gson();
    
    @Override
    public String encode(Packet packet) throws EncodeException
    {
        return gson.toJson(packet);
    }
    
    @Override
    public Packet decode(String s) throws DecodeException
    {
        return gson.fromJson(s, Packet.class);
    }
    
    @Override
    public boolean willDecode(String s)
    {
        return s != null;
    }
    
    @Override
    public void init(EndpointConfig endpointConfig)
    {
    }
    
    @Override
    public void destroy()
    {
    }
    
}
