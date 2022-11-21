package game.cards.bt1;

import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT1001 extends GameCard
{
    public BT1001(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ピョコモン";
    }

    @Override
    public String GetEnglishName()
    {
        return "Yokomon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-001";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGITAMA;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED);
    }

    @Override
    public Integer getPlayCost()
    {
        return null;
    }

    @Override
    public Integer getLevel()
    {
        return 2;
    }

    @Override
    public Integer getDp()
    {
        return null;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.IN_TRAINING;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return null;
    }

    @Override
    public DigimonType getType()
    {
        return DigimonType.BULB;
    }
}