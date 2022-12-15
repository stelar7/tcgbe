package game.cards.bt10;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT10041 extends GameCard
{
    public BT10041(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "サクヤモン:巫女モード";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Sakuyamon: Maid Mode";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT10-041";
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
        return Set.of(DigimonType.SHAMAN);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW, 5, 3), new DigivolutionRequirement(GameCardColor.YELLOW, 6, 2));
    }
}
