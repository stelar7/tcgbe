package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9051 extends GameCard
{
    public BT9051(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "パンジャモン Ｘ抗体";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Panjyamon X Anti-body";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-051";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.GREEN, GameCardColor.BLUE);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 7;
    }
    
    @Override
    public Integer getLevel()
    {
        return 5;
    }
    
    @Override
    public Integer getDp()
    {
        return 7000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ULTIMATE;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VACCINE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.BEASTKIN, DigimonType.X_ANTIBODY);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN, 4, 3), new DigivolutionRequirement(GameCardColor.BLUE, 4, 3));
    }
}
