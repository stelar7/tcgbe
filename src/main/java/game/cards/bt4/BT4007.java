package game.cards.bt4;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT4007 extends GameCard
{
    public BT4007(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "オタマモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Otamamon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-007";
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
        return 2;
    }

    @Override
    public Integer getLevel()
    {
        return 3;
    }

    @Override
    public Integer getDp()
    {
        return 5000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ROOKIE;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.DATA;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.AMPHIBIAN);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED,2,2));
    }
}
