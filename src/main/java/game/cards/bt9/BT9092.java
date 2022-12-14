package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9092 extends GameCard
{
    public BT9092(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "クールボーイ";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Cool Boy";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-092";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.WHITE);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 2;
    }
    
    @Override
    public Integer getLevel()
    {
        return null;
    }
    
    @Override
    public Integer getDp()
    {
        return null;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return null;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return null;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return null;
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
