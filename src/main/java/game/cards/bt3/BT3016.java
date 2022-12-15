package game.cards.bt3;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT3016 extends GameCard
{
    public BT3016(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "デュランダモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Durandamon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT3-016";
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
        return 10;
    }
    
    @Override
    public Integer getLevel()
    {
        return 6;
    }
    
    @Override
    public Integer getDp()
    {
        return 12000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.MEGA;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VACCINE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.HOLY_SWORD, DigimonType.LEGEND_ARMS);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 5, 3), new DigivolutionRequirement(GameCardColor.BLACK, 5, 3));
    }
}
