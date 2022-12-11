package game.cards.bt4;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT4090 extends GameCard
{
    public BT4090(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "カオスモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Chaosmon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-090";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.WHITE);
    }

    @Override
    public Integer getPlayCost()
    {
        return 15;
    }

    @Override
    public Integer getLevel()
    {
        return 7;
    }

    @Override
    public Integer getDp()
    {
        return 14000;
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
        return Set.of(DigimonType.UNIQUE);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN,6,6), new DigivolutionRequirement(GameCardColor.BLACK,6,6));
    }
}
