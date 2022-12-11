package game.cards.bt3;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT3049 extends GameCard
{
    public BT3049(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "フライモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Flymon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT3-049";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 5;
    }
    
    @Override
    public Integer getLevel()
    {
        return 4;
    }
    
    @Override
    public Integer getDp()
    {
        return 4000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.CHAMPION;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VIRUS;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.INSECTOID);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN, 2, 3));
    }
}
