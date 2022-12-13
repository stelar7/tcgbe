package game.cards.bt7;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT7107 extends GameCard
{
    public BT7107(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ヤミからの呼び声";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Calling From the Darkness";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT7-107";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 1;
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
