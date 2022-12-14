package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9014 extends GameCard
{
    public BT9014(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "メガログラウモン X抗体";
    }
    
    @Override
    public String getEnglishName()
    {
        return "WarGrowlmon X Anti-body";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-014";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED);
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
        return Set.of(DigimonType.CYBORG, DigimonType.X_ANTIBODY);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 4, 3));
    }
}
