package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9078 extends GameCard
{
    public BT9078(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "デクスドルグレモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "DexDoruGreymon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-078";
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
        return 8;
    }
    
    @Override
    public Integer getLevel()
    {
        return 5;
    }
    
    @Override
    public Integer getDp()
    {
        return 8000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ULTIMATE;
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
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 4, 4), new DigivolutionRequirement(GameCardColor.BLACK, 4, 4));
    }
}
