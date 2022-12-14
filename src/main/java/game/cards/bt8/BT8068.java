package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8068 extends GameCard
{
    public BT8068(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "バンチョーマメモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "BanchoMamemon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-068";
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
        return DigimonAttribute.DATA;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.MUTANT, DigimonType.BOSS);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK, 5, 3));
    }
}
