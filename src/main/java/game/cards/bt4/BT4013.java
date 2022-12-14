package game.cards.bt4;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT4013 extends GameCard
{
    public BT4013(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ヴリトラモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "BurningGreymon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT4-013";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 6;
    }
    
    @Override
    public Integer getLevel()
    {
        return 4;
    }
    
    @Override
    public Integer getDp()
    {
        return 6000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.HYBRID;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VARIABLE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.DARK_DRAGON);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 3, 3));
    }
}
