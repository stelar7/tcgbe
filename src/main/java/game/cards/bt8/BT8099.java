package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8099 extends GameCard
{
    public BT8099(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ギガデス";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Giga Death";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-099";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLUE, GameCardColor.GREEN);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 9;
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
