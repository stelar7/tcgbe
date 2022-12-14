package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9083 extends GameCard
{
    public BT9083(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "オメガモン：マーシフルモード";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Omnimon: Merciful Mode";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-083";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.WHITE);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 15;
    }
    
    @Override
    public Integer getLevel()
    {
        return 7;
    }
    
    @Override
    public Integer getDp()
    {
        return 15000;
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
        return Set.of(DigimonType.HOLY_WARRIOR);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 6, 6), new DigivolutionRequirement(GameCardColor.BLUE, 6, 6));
    }
}
