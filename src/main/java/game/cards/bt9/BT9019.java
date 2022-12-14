package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9019 extends GameCard
{
    public BT9019(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ガニモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Crabmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-019";
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
        return Set.of(DigimonType.CRUSTACEAN);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLUE, 2, 0));
    }
}
