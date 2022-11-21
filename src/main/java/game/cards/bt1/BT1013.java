package game.cards.bt1;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Optional;
import java.util.Set;

public class BT1013 extends GameCard
{
    public BT1013(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ムーチョモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Muchomon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-013";
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
        return 5000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ROOKIE;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.DATA;
    }

    @Override
    public DigimonType getType()
    {
        return DigimonType.AVIAN;
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return Optional.of(new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 2, 1)));
    }
}
