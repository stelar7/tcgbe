package game.cards.bt1;

import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Optional;
import java.util.Set;

public class BT1008 extends GameCard
{
    public BT1008(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "フリモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Frimon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-008";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGITAMA;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN);
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

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
