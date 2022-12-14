package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9090 extends GameCard
{
    public BT9090(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "姫川 マキ";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Maki Himekawa";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-090";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLACK);
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
