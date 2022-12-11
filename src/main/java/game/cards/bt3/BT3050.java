package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3050 extends GameCard
{
    public BT3050(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "スティングモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Stingmon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-050";
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
        return DigimonAttribute.FREE;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.INSECTOID);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN,1,3));
    }
}
