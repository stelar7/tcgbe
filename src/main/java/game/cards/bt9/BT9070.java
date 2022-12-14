package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9070 extends GameCard
{
    public BT9070(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ガジモン X抗体";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Gazimon X Anti-Body";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-070";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.PURPLE);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 3;
    }
    
    @Override
    public Integer getLevel()
    {
        return 3;
    }
    
    @Override
    public Integer getDp()
    {
        return 3000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.ROOKIE;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.VIRUS;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.MAMMAL, DigimonType.X_ANTIBODY);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.PURPLE, 2, 0));
    }
}
