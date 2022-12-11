package game.cards.bt4;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT4023 extends GameCard
{
    public BT4023(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ストラビモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Strabimon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-023";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLUE);
    }

    @Override
    public Integer getPlayCost()
    {
        return 3;
    }

    @Override
    public Integer getLevel()
    {
        return 3;
    }

    @Override
    public Integer getDp()
    {
        return 2000;
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
        return Set.of(DigimonType.BEASTKIN);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLUE,0,2));
    }
}
