package game.cards.bt8;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT8062 extends GameCard
{
    public BT8062(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "スカルナイトモン：騎馬モード";
    }
    
    @Override
    public String getEnglishName()
    {
        return "SkullKnightmon Cavalier Mode";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT8-062";
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
        return 5000;
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
        return Set.of(DigimonType.ENHANCEMENT);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK, 3, 3), new DigivolutionRequirement(GameCardColor.BLACK, 4, 1));
    }
}
