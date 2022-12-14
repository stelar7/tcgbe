package game.cards.bt1;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT1007 extends GameCard
{
    public BT1007(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "タネモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Tanemon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT1-007";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGITAMA;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return null;
    }
    
    @Override
    public Integer getLevel()
    {
        return 2;
    }
    
    @Override
    public Integer getDp()
    {
        return null;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.IN_TRAINING;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return null;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.BULB);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
