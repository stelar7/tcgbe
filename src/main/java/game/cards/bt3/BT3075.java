package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3075 extends GameCard
{
    public BT3075(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "クレニアムモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Craniamon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-075";
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
        return 13;
    }

    @Override
    public Integer getLevel()
    {
        return 6;
    }

    @Override
    public Integer getDp()
    {
        return 12000;
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
        return Set.of(DigimonType.HOLY_WARRIOR, DigimonType.ROYAL_KNIGHT);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK,4,5));
    }
}
