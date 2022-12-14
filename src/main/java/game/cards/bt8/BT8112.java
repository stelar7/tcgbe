package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8112 extends GameCard
{
    public BT8112(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "インペリアルドラモン：パラディンモード";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Imperialdramon Paladin Mode";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-112";
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
        return 16000;
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
        return Set.of(DigimonType.ANCIENT_HOLY_WARRIOR);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLUE, 6, 7), new DigivolutionRequirement(GameCardColor.GREEN, 6, 7));
    }
}
