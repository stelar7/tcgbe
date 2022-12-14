package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8087 extends GameCard
{
    public BT8087(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "高石タケル";
    }
    
    @Override
    public String getEnglishName()
    {
        return "T.K. Takaishi";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-087";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLUE);
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
