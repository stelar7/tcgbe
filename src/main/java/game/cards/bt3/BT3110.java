package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3110 extends GameCard
{
    public BT3110(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ネクロフォビア";
    }

    @Override
    public String getEnglishName()
    {
        return "Necrophobia" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-110";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE);
    }

    @Override
    public Integer getPlayCost()
    {
        return 5;
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
