package game.cards.bt3;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT3111 extends GameCard
{
    public BT3111(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "インペリアルドラモン：ドラゴンモード";
    }

    @Override
    public String getEnglishName()
    {
        return "Imperialdramon : Dragon Mode" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-111";
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
        return 13;
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
        return DigimonAttribute.VIRUS;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.ANCIENT_DRAGON);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN,5,5), new DigivolutionRequirement(GameCardColor.BLUE,5,5));
    }
}
