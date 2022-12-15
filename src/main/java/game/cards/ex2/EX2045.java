package game.cards.ex2;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class EX2045 extends GameCard
{
    public EX2045(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "クルモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Calumon";
    }
    
    @Override
    public String getCardCode()
    {
        return "EX2-045";
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
        return 3;
    }
    
    @Override
    public Integer getLevel()
    {
        return null;
    }
    
    @Override
    public Integer getDp()
    {
        return 1000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.UNKNOWN;
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
        return null;
    }
}
