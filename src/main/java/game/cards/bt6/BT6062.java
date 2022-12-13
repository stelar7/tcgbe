package game.cards.bt6;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT6062 extends GameCard
{
    public BT6062(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ボルケーモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Volcanomon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT6-062";
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
        return 6;
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
        return DigimonAttribute.DATA;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.CYBORG);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.BLACK, 3, 4));
    }
}