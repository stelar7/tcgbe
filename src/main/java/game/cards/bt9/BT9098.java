package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9098 extends GameCard
{
    public BT9098(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "黄金騎士の覚醒";
    }
    
    @Override
    public String getEnglishName()
    {
        return "The Awakening of Gold Digizoid";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-098";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW);
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
