package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8044 extends GameCard
{
    public BT8044(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "チンロンモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Azulongmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-044";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLUE, GameCardColor.YELLOW);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 12;
    }
    
    @Override
    public Integer getLevel()
    {
        return 6;
    }
    
    @Override
    public Integer getDp()
    {
        return 11000;
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
        return Set.of(DigimonType.HOLY_DRAGON, DigimonType.FOUR_GREAT_DRAGONS, DigimonType.FOUR_SOVEREIGNS);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLUE, 5, 3), new DigivolutionRequirement(GameCardColor.YELLOW, 5, 3));
    }
}
