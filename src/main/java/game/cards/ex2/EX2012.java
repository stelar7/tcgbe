package game.cards.ex2;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class EX2012 extends GameCard
{
    public EX2012(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "メギドラモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Megidramon";
    }
    
    @Override
    public String getCardCode()
    {
        return "EX2-012";
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
        return 13;
    }
    
    @Override
    public Integer getLevel()
    {
        return 6;
    }
    
    @Override
    public Integer getDp()
    {
        return 13000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.MEGA;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VIRUS;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.EVIL_DRAGON, DigimonType.FOUR_GREAT_DRAGONS);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 5, 5), new DigivolutionRequirement(GameCardColor.PURPLE, 5, 5));
    }
}
