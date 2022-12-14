package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9075 extends GameCard
{
    public BT9075(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "デクスドルガモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "DexDorugamon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-075";
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
        return 6;
    }
    
    @Override
    public Integer getLevel()
    {
        return 4;
    }
    
    @Override
    public Integer getDp()
    {
        return 6000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.CHAMPION;
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
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 3, 3), new DigivolutionRequirement(GameCardColor.BLACK, 3, 3));
    }
}
