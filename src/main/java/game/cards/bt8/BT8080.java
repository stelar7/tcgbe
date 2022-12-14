package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8080 extends GameCard
{
    public BT8080(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ヴァンデモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Myotismon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-080";
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
        return 8;
    }
    
    @Override
    public Integer getLevel()
    {
        return 5;
    }
    
    @Override
    public Integer getDp()
    {
        return 8000;
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
        return Set.of(DigimonType.UNDEAD);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 4, 3));
    }
}
