package game.cards.bt4;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT4099 extends GameCard
{
    public BT4099(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "竜の力を継ぐもの";
    }

    @Override
    public String getEnglishName()
    {
        return "Heir of Dragons" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-099";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
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
