package game.cards.bt10;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT10026 extends GameCard
{
    public BT10026(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "デッカーグレイモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "DeckerGreymon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT10-026";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLUE);
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
        return DigimonAttribute.VIRUS;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.ENHANCEMENT, DigimonType.BLUE_FLARE);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLUE, 4, 4), new DigivolutionRequirement(GameCardColor.BLUE, 5, 2));
    }
}
