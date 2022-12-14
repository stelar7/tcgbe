package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9066 extends GameCard
{
    public BT9066(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "アルファモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Alphamon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-066";
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
        return DigimonAttribute.VACCINE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.HOLY_WARRIOR, DigimonType.ROYAL_KNIGHT, DigimonType.X_ANTIBODY);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK, 5, 3));
    }
}
