package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9038 extends GameCard
{
    public BT9038(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ペガスモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Pegasusmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-038";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.YELLOW, GameCardColor.BLUE);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 5;
    }
    
    @Override
    public Integer getLevel()
    {
        return 4;
    }
    
    @Override
    public Integer getDp()
    {
        return 5000;
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
        return Set.of(DigimonType.HOLY_BEAST);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.YELLOW, 3, 3));
    }
}
