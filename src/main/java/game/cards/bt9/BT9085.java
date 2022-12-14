package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9085 extends GameCard
{
    public BT9085(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "石田ヤマト & 武之内空";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Matt Ishida & Sora Takenouchi";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-085";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLUE, GameCardColor.RED);
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
