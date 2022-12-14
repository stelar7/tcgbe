package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8075 extends GameCard
{
    public BT8075(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "コウガモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Kogamon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-075";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE, GameCardColor.GREEN);
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
        return DigivolutionForm.CHAMPION;
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
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 3, 2), new DigivolutionRequirement(GameCardColor.GREEN, 3, 2));
    }
}
