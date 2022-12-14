package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8048 extends GameCard
{
    public BT8048(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ホルスモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Shurimon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-048";
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
        return 4;
    }
    
    @Override
    public Integer getLevel()
    {
        return 4;
    }
    
    @Override
    public Integer getDp()
    {
        return 4000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ARMOR_FORM;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.FREE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.MUTANT);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN, 3, 3));
    }
}
