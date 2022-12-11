package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3072 extends GameCard
{
    public BT3072(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ブリウエルドラモン";
    }

    @Override
    public String getEnglishName()
    {
        return "BryweLudramon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-072";
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
        return 10;
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
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK,3,5), new DigivolutionRequirement(GameCardColor.RED,3,5));
    }
}
