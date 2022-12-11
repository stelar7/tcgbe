package game.cards.bt3;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT3097 extends GameCard
{
    public BT3097(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "緻密な戦術";
    }

    @Override
    public String getEnglishName()
    {
        return "A Delicate Plan" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-097";
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
