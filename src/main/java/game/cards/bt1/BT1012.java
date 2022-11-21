package game.cards.bt1;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Optional;
import java.util.Set;

public class BT1012 extends GameCard
{
    public BT1012(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ピヨモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Biyomon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-012";
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
        return 2000;
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
        return DigimonType.BIRD;
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return Optional.of(new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 2, 0)));
    }
}
