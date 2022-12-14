package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8045 extends GameCard
{
    public BT8045(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "エカキモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Ekakimon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-045";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 2;
    }
    
    @Override
    public Integer getLevel()
    {
        return 3;
    }
    
    @Override
    public Integer getDp()
    {
        return 3000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ROOKIE;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.DATA;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.MUTANT);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN, 2, 0));
    }
}
