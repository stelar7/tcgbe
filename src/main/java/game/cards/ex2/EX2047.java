package game.cards.ex2;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class EX2047 extends GameCard
{
    public EX2047(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ADR-03=ペンデュラムフィート";
    }
    
    @Override
    public String getEnglishName()
    {
        return "ADR-03 Pendulum Feet";
    }
    
    @Override
    public String getCardCode()
    {
        return "EX2-047";
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
        return 0;
    }
    
    @Override
    public Integer getDp()
    {
        return 3000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.D_REAPER;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return null;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.AA_DEFENSE_AGENT);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
