package game.cards.bt4;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT4020 extends GameCard
{
    public BT4020(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "シャイングレイモン";
    }

    @Override
    public String getEnglishName()
    {
        return "ShineGreymon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-020";
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
        return 12;
    }

    @Override
    public Integer getLevel()
    {
        return 6;
    }

    @Override
    public Integer getDp()
    {
        return 11000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.MEGA;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VACCINE;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.LIGHT_DRAGON);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED,3,5), new DigivolutionRequirement(GameCardColor.YELLOW,3,5));
    }
}
