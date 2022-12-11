package game.cards.bt3;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT3107 extends GameCard
{
    public BT3107(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "あの頃はよかった";
    }

    @Override
    public String getEnglishName()
    {
        return "Looking Back on the Good Times" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-107";
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
