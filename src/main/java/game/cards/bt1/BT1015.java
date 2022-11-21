package game.cards.bt1;

import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT1015 extends GameCard
{
    public BT1015(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "グレイモン";
    }

    @Override
    public String GetEnglishName()
    {
        return "Greymon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-015";
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
        return 4;
    }

    @Override
    public Integer getLevel()
    {
        return 4;
    }

    @Override
    public Integer getDp()
    {
        return 4000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.CHAMPION;
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
