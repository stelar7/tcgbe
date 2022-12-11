package game.cards.bt4;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT4012 extends GameCard
{
    public BT4012(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ジオグレイモン";
    }

    @Override
    public String getEnglishName()
    {
        return "GeoGreymon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-012";
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
        return 5;
    }

    @Override
    public Integer getLevel()
    {
        return 4;
    }

    @Override
    public Integer getDp()
    {
        return 5000;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.CHAMPION;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VACCINE;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.DINOSAUR);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED,2,3));
    }
}
