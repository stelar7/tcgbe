package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9068 extends GameCard
{
    public BT9068(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ガイオウモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Gaiomon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-068";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.BLACK, GameCardColor.RED);
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
        return 13000;
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
        return Set.of(DigimonType.DRAGONKIN, DigimonType.X_ANTIBODY);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK, 5, 5), new DigivolutionRequirement(GameCardColor.RED, 5, 5));
    }
}
