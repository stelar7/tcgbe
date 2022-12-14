package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9029 extends GameCard
{
    public BT9029(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "スイジンモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Suijinmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-029";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLUE, GameCardColor.BLACK);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 11;
    }
    
    @Override
    public Integer getLevel()
    {
        return 6;
    }
    
    @Override
    public Integer getDp()
    {
        return 11000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.MEGA;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.DATA;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.MACHINE);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLUE, 5, 3), new DigivolutionRequirement(GameCardColor.BLACK, 5, 3));
    }
}
