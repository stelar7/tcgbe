package game.cards.bt10;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT10009 extends GameCard
{
    public BT10009(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "シャウトモンX4";
    }
    
    @Override
    public String getEnglishName()
    {
        return "ShoutmonX4";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT10-009";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED, GameCardColor.YELLOW);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 9;
    }
    
    @Override
    public Integer getLevel()
    {
        return 4;
    }
    
    @Override
    public Integer getDp()
    {
        return 12000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.CHAMPION;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.DATA;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.COMPOSITE, DigimonType.XROS_HEART);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 3, 3), new DigivolutionRequirement(GameCardColor.YELLOW, 3, 3));
    }
}
