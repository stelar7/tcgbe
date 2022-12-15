package game.cards.st13;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class ST1306 extends GameCard
{
    public ST1306(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ラグナロードモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "RagnaLoardmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "ST13-06";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED, GameCardColor.BLACK);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 15;
    }
    
    @Override
    public Integer getLevel()
    {
        return 7;
    }
    
    @Override
    public Integer getDp()
    {
        return 15000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.MEGA;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VIRUS;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.UNIQUE, DigimonType.LEGEND_ARMS);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 6, 6), new DigivolutionRequirement(GameCardColor.BLACK, 6, 6));
    }
}
