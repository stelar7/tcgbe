package game.cards.p;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class P030 extends GameCard
{
    public P030(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ヴォルフモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Lobomon";
    }
    
    @Override
    public String getCardCode()
    {
        return "P-030";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLUE);
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
        return Set.of(DigimonType.WARRIOR);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLUE, 3, 2));
    }
}
