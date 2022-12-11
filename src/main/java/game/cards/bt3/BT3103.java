package game.cards.bt3;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT3103 extends GameCard
{
    public BT3103(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "秘めたる力の発現！！";
    }

    @Override
    public String getEnglishName()
    {
        return "Hidden Potential Discovered!" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT3-103";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.OPTION;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN);
    }

    @Override
    public Integer getPlayCost()
    {
        return 0;
    }

    @Override
    public Integer getLevel()
    {
        return null;
    }

    @Override
    public Integer getDp()
    {
        return null;
    }

    @Override
    public DigivolutionForm getForm()
    {
        return null;
    }

    @Override
    public DigimonAttribute getAttribute()
    {
        return null;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return null;
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
