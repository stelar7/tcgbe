package game.cards.p;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class P029 extends GameCard
{
    public P029(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "アグニモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Agunimon";
    }
    
    @Override
    public String getCardCode()
    {
        return "P-029";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 5;
    }
    
    @Override
    public Integer getLevel()
    {
        return 4;
    }
    
    @Override
    public Integer getDp()
    {
        return 4000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.HYBRID;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VARIABLE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.WIZARD);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 3, 2));
    }
}
