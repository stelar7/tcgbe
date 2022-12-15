package game.cards.ex1;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class EX1018 extends GameCard
{
    public EX1018(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ズドモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Zudomon";
    }
    
    @Override
    public String getCardCode()
    {
        return "EX1-018";
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
        return 8;
    }
    
    @Override
    public Integer getLevel()
    {
        return 5;
    }
    
    @Override
    public Integer getDp()
    {
        return 8000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ULTIMATE;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VACCINE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.SEA_BEAST);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLUE, 4, 3));
    }
}
