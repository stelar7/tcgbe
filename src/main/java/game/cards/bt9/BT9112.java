package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9112 extends GameCard
{
    public BT9112(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "デクスモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Dexmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-112";
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
        return 20;
    }
    
    @Override
    public Integer getLevel()
    {
        return 7;
    }
    
    @Override
    public Integer getDp()
    {
        return 15000;
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
        return Set.of(DigimonType.UNANALYZABLE, DigimonType.X_PROGRAM);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 6, 6), new DigivolutionRequirement(GameCardColor.BLACK, 6, 6));
    }
}
