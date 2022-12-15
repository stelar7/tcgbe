package game.cards.ex2;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class EX2055 extends GameCard
{
    public EX2055(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "リーパー";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Reaper";
    }
    
    @Override
    public String getCardCode()
    {
        return "EX2-055";
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
        return 20;
    }
    
    @Override
    public Integer getLevel()
    {
        return 0;
    }
    
    @Override
    public Integer getDp()
    {
        return 15000;
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
        return Set.of(DigimonType.ABILITY_SYNTHESIS_AGENT);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
