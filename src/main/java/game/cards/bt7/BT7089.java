package game.cards.bt7;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT7089 extends GameCard
{
    public BT7089(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "柴山純平";
    }
    
    @Override
    public String getEnglishName()
    {
        return "J.P. Shibayama";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT7-089";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 3;
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
