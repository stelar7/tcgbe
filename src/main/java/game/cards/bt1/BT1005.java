package game.cards.bt1;

import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT1005 extends GameCard
{
    public BT1005(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "キャロモン";
    }

    @Override
    public String GetEnglishName()
    {
        return "Kyaromon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-005";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGITAMA;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW);
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
        return DigimonType.LESSER;
    }
}
