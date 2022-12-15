package game.cards.p;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class P002 extends GameCard
{
    public P002(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ピヨモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Biyomon";
    }
    
    @Override
    public String getCardCode()
    {
        return "P-002";
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
        return 3;
    }
    
    @Override
    public Integer getLevel()
    {
        return 3;
    }
    
    @Override
    public Integer getDp()
    {
        return 2000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ROOKIE;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VACCINE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.CHICK);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 2, 0));
    }
}
