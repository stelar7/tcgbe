package game.cards.bt8;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT8041 extends GameCard
{
    public BT8041(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "キュウキモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Kyukimon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT8-041";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW, GameCardColor.PURPLE);
    }

    @Override
    public Integer getPlayCost()
    {
        return 7;
    }

    @Override
    public Integer getLevel()
    {
        return 5;
    }

    @Override
    public Integer getDp()
    {
        return 9000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ULTIMATE;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VIRUS;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.MYSTERIOUS_BEAST);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW,4,3), new DigivolutionRequirement(GameCardColor.PURPLE,4,3));
    }
}
