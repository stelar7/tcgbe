package game.cards.bt3;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT3095 extends GameCard
{
    public BT3095(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "城戸 丈";
    }

    @Override
    public String getEnglishName()
    {
        return "Joe Kido" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-095";
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
