package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3062 extends GameCard
{
    public BT3062(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ルドモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Ludomon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-062";
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
        return 1000;
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
        return Set.of(DigimonType.ARMOR, DigimonType.LEGEND_ARMS);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK,0,2));
    }
}
