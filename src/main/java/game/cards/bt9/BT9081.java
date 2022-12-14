package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9081 extends GameCard
{
    public BT9081(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "デクスドルゴラモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "DexDorugoramon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-081";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE, GameCardColor.BLACK);
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
        return Set.of(DigimonType.UNDEAD, DigimonType.X_ANTIBODY);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 5, 5), new DigivolutionRequirement(GameCardColor.BLACK, 5, 5));
    }
}
