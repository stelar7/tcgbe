package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9042 extends GameCard
{
    public BT9042(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ライジンモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Raijinmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-042";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW, GameCardColor.BLACK);
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
        return DigimonAttribute.VIRUS;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.CYBORG);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW, 5, 3), new DigivolutionRequirement(GameCardColor.BLACK, 5, 3));
    }
}
