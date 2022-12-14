package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8088 extends GameCard
{
    public BT8088(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "本宮 大輔 & 一乗寺 賢";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Davis Motomiya & Ken Ichijoji";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-088";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLUE, GameCardColor.GREEN);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 4;
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
