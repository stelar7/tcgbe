package game.cards.bt1;

import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT1011 extends GameCard
{
    public BT1011(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "アグモン博士";
    }

    @Override
    public String GetEnglishName()
    {
        return "Agumon Expert";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-011";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
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
        return 3;
    }

    @Override
    public Integer getDp()
    {
        return 1000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ROOKIE;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VACCINE;
    }

    @Override
    public DigimonType getType()
    {
        return DigimonType.DINOSAUR;
    }
}
