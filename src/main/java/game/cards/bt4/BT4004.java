package game.cards.bt4;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT4004 extends GameCard
{
    public BT4004(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "バドモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Budmon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-004";
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
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.VEGETATION);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
