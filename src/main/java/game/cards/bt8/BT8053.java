package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8053 extends GameCard
{
    public BT8053(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ライドラモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Lighdramon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-053";
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
        return Set.of(DigimonType.BEAST);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.GREEN, 3, 3));
    }
}
