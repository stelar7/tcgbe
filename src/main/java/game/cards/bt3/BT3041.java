package game.cards.bt3;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT3041 extends GameCard
{
    public BT3041(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ケルビモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Cherubimon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT3-041";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW);
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
        return DigimonAttribute.VACCINE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.CHERUB, DigimonType.THREE_GREAT_ANGELS);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW, 3, 5));
    }
}
