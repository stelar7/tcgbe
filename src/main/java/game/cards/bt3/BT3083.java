package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3083 extends GameCard
{
    public BT3083(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "メラモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Meramon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-083";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE);
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
        return DigimonAttribute.DATA;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.FLAME);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE,1,3));
    }
}
