package game.cards.st13;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class ST1314 extends GameCard
{
    public ST1314(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ブリウエルドラモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "BryweLudramon";
    }
    
    @Override
    public String getCardCode()
    {
        return "ST13-14";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLACK);
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
        return DigimonAttribute.DATA;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.ARMOR, DigimonType.LEGEND_ARMS);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK, 5, 4), new DigivolutionRequirement(GameCardColor.RED, 5, 4));
    }
}
