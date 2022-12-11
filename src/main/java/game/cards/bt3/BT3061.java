package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3061 extends GameCard
{
    public BT3061(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "チューモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Chuumon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-061";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLACK);
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
        return 1000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ROOKIE;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VIRUS;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.BEAST);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK,0,2));
    }
}
