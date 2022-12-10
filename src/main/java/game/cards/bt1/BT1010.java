package game.cards.bt1;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT1010 extends GameCard
{
    public BT1010(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "アグモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Agumon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-010";
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
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.REPTILE);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 2, 0));
    }
}
