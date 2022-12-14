package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9044 extends GameCard
{
    public BT9044(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "マグナモン X抗体";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Magnamon X Anti-body";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-044";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW, GameCardColor.BLUE);
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
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW, 5, 3), new DigivolutionRequirement(GameCardColor.BLUE, 5, 3));
    }
}
