package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3044 extends GameCard
{
    public BT3044(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "アルラウモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Aruraumon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-044";
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
        return Set.of(DigimonType.VEGETATION);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN,2,2));
    }
}
