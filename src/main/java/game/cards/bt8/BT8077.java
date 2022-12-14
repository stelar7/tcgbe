package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8077 extends GameCard
{
    public BT8077(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ブラックテイルモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "BlackGatomon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-077";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE, GameCardColor.YELLOW);
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
        return Set.of(DigimonType.DARK_ANIMAL);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 4, 3), new DigivolutionRequirement(GameCardColor.YELLOW, 4, 3));
    }
}
