package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9022 extends GameCard
{
    public BT9022(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "エビドラモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Ebidramon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-022";
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
        return 3;
    }
    
    @Override
    public Integer getLevel()
    {
        return 4;
    }
    
    @Override
    public Integer getDp()
    {
        return 5000;
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
        return Set.of(DigimonType.AQUATIC);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLUE, 3, 2));
    }
}
