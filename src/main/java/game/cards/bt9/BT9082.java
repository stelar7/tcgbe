package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9082 extends GameCard
{
    public BT9082(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "オルディネモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Ordinemon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-082";
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
        return Set.of(DigimonType.FALLEN_ANGEL);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 6, 6), new DigivolutionRequirement(GameCardColor.YELLOW, 6, 6));
    }
}
