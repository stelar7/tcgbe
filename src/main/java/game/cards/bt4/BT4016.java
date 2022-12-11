package game.cards.bt4;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT4016 extends GameCard
{
    public BT4016(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "アルダモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Aldamon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-016";
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
        return 8;
    }

    @Override
    public Integer getLevel()
    {
        return 5;
    }

    @Override
    public Integer getDp()
    {
        return 7000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.HYBRID;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VARIABLE;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.WIZARD);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED,3,4));
    }
}