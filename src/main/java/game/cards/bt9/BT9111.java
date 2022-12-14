package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9111 extends GameCard
{
    public BT9111(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "アルファモン：王竜剣";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Alphamon: Ouryuken";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-111";
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
        return 15;
    }
    
    @Override
    public Integer getLevel()
    {
        return 7;
    }
    
    @Override
    public Integer getDp()
    {
        return 16000;
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
        return Set.of(DigimonType.NO_DATA, DigimonType.ROYAL_KNIGHT, DigimonType.X_ANTIBODY);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK, 6, 7));
    }
}
