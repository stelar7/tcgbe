package game.cards.st6;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class ST604 extends GameCard
{
    public ST604(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ドラクモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Dracmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "ST6-04";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 3;
    }
    
    @Override
    public Integer getLevel()
    {
        return 3;
    }
    
    @Override
    public Integer getDp()
    {
        return 2000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ROOKIE;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VIRUS;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.UNDEAD);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 2, 0));
    }
}
