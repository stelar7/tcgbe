package game.cards.bt10;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT10013 extends GameCard
{
    public BT10013(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "シャウトモンX5";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Shoutmon X5";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT10-013";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED, GameCardColor.BLACK);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 10;
    }
    
    @Override
    public Integer getLevel()
    {
        return 5;
    }
    
    @Override
    public Integer getDp()
    {
        return 10000;
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
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 4, 4), new DigivolutionRequirement(GameCardColor.BLACK, 4, 4));
    }
}
