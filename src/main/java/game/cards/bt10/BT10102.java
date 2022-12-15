package game.cards.bt10;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT10102 extends GameCard
{
    public BT10102(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ピョンダンプ";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Pyon Dump";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT10-102";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 2;
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
