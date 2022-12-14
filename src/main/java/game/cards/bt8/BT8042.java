package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8042 extends GameCard
{
    public BT8042(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "シャッコウモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Shakkoumon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-042";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW, GameCardColor.BLUE);
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
        return DigimonAttribute.FREE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.MUTANT);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW, 4, 4), new DigivolutionRequirement(GameCardColor.BLUE, 4, 4));
    }
}
