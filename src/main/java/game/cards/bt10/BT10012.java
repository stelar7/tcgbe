package game.cards.bt10;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT10012 extends GameCard
{
    public BT10012(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "シャウトモンX4B";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Shoutmon X4B";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT10-012";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED, GameCardColor.PURPLE);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 9;
    }
    
    @Override
    public Integer getLevel()
    {
        return 5;
    }
    
    @Override
    public Integer getDp()
    {
        return 9000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ULTIMATE;
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
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 4, 3), new DigivolutionRequirement(GameCardColor.PURPLE, 4, 3));
    }
}
