package game.cards.bt1;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Optional;
import java.util.Set;

public class BT1016 extends GameCard
{
    public BT1016(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ティラノモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Tyrannomon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-016";
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
        return DigimonAttribute.DATA;
    }

    @Override
    public DigimonType getType()
    {
        return DigimonType.DINOSAUR;
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return Optional.of(new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 3, 2)));
    }
}