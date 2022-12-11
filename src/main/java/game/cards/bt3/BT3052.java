package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3052 extends GameCard
{
    public BT3052(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ラピッドモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Rapidmon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-052";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN);
    }

    @Override
    public Integer getPlayCost()
    {
        return 6;
    }

    @Override
    public Integer getLevel()
    {
        return 5;
    }

    @Override
    public Integer getDp()
    {
        return 6000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ULTIMATE;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VACCINE;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.CYBORG);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN,2,4));
    }
}
