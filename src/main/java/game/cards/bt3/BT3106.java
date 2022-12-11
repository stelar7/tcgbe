package game.cards.bt3;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT3106 extends GameCard
{
    public BT3106(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "獣狼大回転";
    }

    @Override
    public String getEnglishName()
    {
        return "Beast Cyclone" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-106";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
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
