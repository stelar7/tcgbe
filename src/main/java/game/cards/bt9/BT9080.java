package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9080 extends GameCard
{
    public BT9080(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ラグエルモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Raguelmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-080";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE, GameCardColor.YELLOW);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 12;
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
        return DigimonAttribute.UNKNOWN;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.UNKNOWN);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 5, 4), new DigivolutionRequirement(GameCardColor.YELLOW, 5, 4));
    }
}
