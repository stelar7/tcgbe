package game.basic;

import game.enums.*;

import java.util.*;


public class GameCard
{
    private String             name;
    private String             cardCode;
    private GameCardType       cardType;
    private Set<GameCardColor> colors;
    private Integer            playCost;
    private Integer            level;
    private Integer            dp;
    private String             form;
    private String             attribute;
    private String             type;
    
    private final String uuid;
    
    public GameCard()
    {
        this.uuid = UUID.randomUUID().toString();
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getCardCode()
    {
        return cardCode;
    }
    
    public GameCardType getCardType()
    {
        return cardType;
    }
    
    public Set<GameCardColor> getColors()
    {
        return colors;
    }
    
    public Integer getPlayCost()
    {
        return playCost;
    }
    
    public Integer getLevel()
    {
        return level;
    }
    
    public Integer getDp()
    {
        return dp;
    }
    
    public String getForm()
    {
        return form;
    }
    
    public String getAttribute()
    {
        return attribute;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String getUUID()
    {
        return uuid;
    }
}
