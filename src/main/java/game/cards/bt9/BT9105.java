package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9105 extends GameCard
{
    public BT9105(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "デジタライズ・オブ・ソウル";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Digitalize of Soul";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-105";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLACK);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 5;
    }
    
    @Override
    public Integer getLevel()
    {
        return null;
    }
    
    @Override
    public Integer getDp()
    {
        return null;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return null;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return null;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return null;
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
