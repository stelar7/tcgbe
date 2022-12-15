package game.cards.bt10;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT10085 extends GameCard
{
    public BT10085(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "シスタモン シエル";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Sistermon Ciel";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT10-085";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.WHITE);
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
        return DigimonAttribute.DATA;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.PUPPET);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return null;
    }
}
