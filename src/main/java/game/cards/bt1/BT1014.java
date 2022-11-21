package game.cards.bt1;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Optional;
import java.util.Set;

public class BT1014 extends GameCard
{
    public BT1014(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "コカトリモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Kokatorimon";
    }

    @Override
    public String getCardCode()
    {
        return "BT1-014";
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
        return DigimonType.GIANT_BIRD;
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return Optional.of(new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 3, 2)));
    }
}
