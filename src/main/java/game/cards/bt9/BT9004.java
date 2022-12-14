package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9004 extends GameCard
{
    public BT9004(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "モチモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Motimon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-004";
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
        return Set.of(DigimonType.LESSER);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
