package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9040 extends GameCard
{
    public BT9040(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "エンジェウーモン X抗体";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Angewomon X Anti-body";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-040";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW);
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
        return DigivolutionForm.ROOKIE;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VACCINE;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.ARCHANGEL, DigimonType.X_ANTIBODY);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW, 4, 3));
    }
}
