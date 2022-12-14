package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9076 extends GameCard
{
    public BT9076(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "メイクラックモン：ヴィシャスモード";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Maycrackmon: Vicious Mode";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-076";
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
        return 6;
    }
    
    @Override
    public Integer getLevel()
    {
        return 5;
    }
    
    @Override
    public Integer getDp()
    {
        return 6000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ULTIMATE;
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
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 4, 4), new DigivolutionRequirement(GameCardColor.YELLOW, 4, 4));
    }
}
