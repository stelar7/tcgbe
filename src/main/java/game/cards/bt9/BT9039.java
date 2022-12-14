package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9039 extends GameCard
{
    public BT9039(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ダークスーパースターモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "DarkSuperStarmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-039";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW, GameCardColor.BLACK);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 7;
    }
    
    @Override
    public Integer getLevel()
    {
        return 5;
    }
    
    @Override
    public Integer getDp()
    {
        return 9000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ULTIMATE;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VIRUS;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.MUTANT);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW, 4, 3), new DigivolutionRequirement(GameCardColor.BLACK, 4, 3));
    }
}
