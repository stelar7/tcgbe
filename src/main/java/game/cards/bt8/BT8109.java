package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8109 extends GameCard
{
    public BT8109(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "フレイムヘルサイズ";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Flame Hellscythe";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-109";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE, GameCardColor.YELLOW);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 6;
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
