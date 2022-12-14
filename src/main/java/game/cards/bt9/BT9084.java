package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9084 extends GameCard
{
    public BT9084(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "八神太一 & 八神ヒカリ";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Tai Kamiya & Kari Kamiya";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-084";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED, GameCardColor.YELLOW);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 4;
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
