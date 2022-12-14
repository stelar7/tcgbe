package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8085 extends GameCard
{
    public BT8085(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "井ノ上京";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Yolei Inoue";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-085";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 3;
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
