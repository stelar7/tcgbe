package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8082 extends GameCard
{
    public BT8082(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "オファニモン：フォールダウンモード";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Ophanimon Falldown Mode";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-082";
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
        return DigimonAttribute.VACCINE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.FALLEN_ANGEL);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 5, 4), new DigivolutionRequirement(GameCardColor.YELLOW, 5, 4));
    }
}
