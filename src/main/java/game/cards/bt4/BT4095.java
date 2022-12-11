package game.cards.bt4;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT4095 extends GameCard
{
    public BT4095(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "藤枝淑乃";
    }

    @Override
    public String getEnglishName()
    {
        return "Yoshino Fujieda" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-095";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN);
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
