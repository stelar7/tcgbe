package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3074 extends GameCard
{
    public BT3074(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "メタルエテモン";
    }

    @Override
    public String getEnglishName()
    {
        return "MetalEtemon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-074";
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
        return 12;
    }

    @Override
    public Integer getLevel()
    {
        return 6;
    }

    @Override
    public Integer getDp()
    {
        return 10000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.MEGA;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VIRUS;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.CYBORG);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK,3,5));
    }
}
