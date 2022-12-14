package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8056 extends GameCard
{
    public BT8056(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "スピノモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Spinomon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-056";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN, GameCardColor.RED);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 10;
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
        return Set.of(DigimonType.DINOSAUR);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN, 5, 3), new DigivolutionRequirement(GameCardColor.RED, 5, 3));
    }
}
