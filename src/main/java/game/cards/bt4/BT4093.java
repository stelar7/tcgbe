package game.cards.bt4;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT4093 extends GameCard
{
    public BT4093(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "トーマ・H・ノルシュタイン";
    }

    @Override
    public String getEnglishName()
    {
        return "Thomas H. Norstein" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT4-093";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.TAMER;
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
