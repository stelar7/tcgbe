package game.basic;

import game.enums.*;

import java.util.*;


public abstract class GameCard
{
    private final String uuid;

    public GameCard(String uuid)
    {
        this.uuid = uuid;
    }

    public abstract String getJapaneseName();

    public abstract String GetEnglishName();

    public abstract String getCardCode();

    public abstract GameCardType getCardType();

    public abstract Set<GameCardColor> getColors();

    public abstract Integer getPlayCost();

    public abstract Integer getLevel();

    public abstract Integer getDp();

    public abstract DigivolutionForm getForm();

    public abstract DigimonAttribute getAttribute();

    public abstract DigimonType getType();

    public String getUUID()
    {
        return uuid;
    }
}
