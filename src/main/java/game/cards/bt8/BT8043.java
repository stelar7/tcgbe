package game.cards.bt8;

import game.basic.DigivolutionRequirement;
import game.basic.DigivolutionRequirements;
import game.basic.GameCard;
import game.enums.*;

import java.util.Set;

public class BT8043 extends GameCard
{
    public BT8043(String uuid)
    {
        super(uuid);
    }

    @Override
    public String getJapaneseName()
    {
        return "ケルビモン";
    }

    @Override
    public String getEnglishName()
    {
        return "Cherubimon" ;
    }

    @Override
    public String getCardCode()
    {
        return "BT8-043";
    }

    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }

    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW);
    }

    @Override
    public Integer getPlayCost()
    {
        return 11;
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
        return DigimonAttribute.VACCINE;
    }

    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.CHERUB, DigimonType.THREE_GREAT_ANGELS);
    }

    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW,5,4), new DigivolutionRequirement(GameCardColor.PURPLE,5,4));
    }
}
