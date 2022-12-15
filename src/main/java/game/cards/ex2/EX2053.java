package game.cards.ex2;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class EX2053 extends GameCard
{
    public EX2053(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ADR-08=オプティナイザー";
    }
    
    @Override
    public String getEnglishName()
    {
        return "ADR-08 Optimizer";
    }
    
    @Override
    public String getCardCode()
    {
        return "EX2-053";
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
        return 10;
    }
    
    @Override
    public Integer getLevel()
    {
        return 0;
    }
    
    @Override
    public Integer getDp()
    {
        return 9000;
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
        return Set.of(DigimonType.MOTHERSHIP_AGENT);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
