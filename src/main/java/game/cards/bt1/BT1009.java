package game.cards.bt1;

import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT1009 extends GameCard
{
    public BT1009(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "モノドラモン";
    }

    @Override
    public String GetEnglishName()
    {
        return "Monodramon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-009";
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
        return 2;
    }

    @Override
    public Integer getLevel()
    {
        return 3;
    }

    @Override
    public Integer getDp()
    {
        return 3000;
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
        return DigimonType.MINI_DRAGON;
    }
}