package game.cards.bt9;

import game.basic.*;
import game.enums.*;

import java.util.Set;

public class BT9018 extends GameCard
{
    public BT9018(String uuid)
    {
        super(uuid);
    }
    
    @Override
    public String getJapaneseName()
    {
        return "ディノレクスモン";
    }
    
    @Override
    public String getEnglishName()
    {
        return "Dinorexmon";
    }
    
    @Override
    public String getCardCode()
    {
        return "BT9-018";
    }
    
    @Override
    public GameCardType getCardType()
    {
        return GameCardType.DIGIMON;
    }
    
    @Override
    public Set<GameCardColor> getColors()
    {
        return Set.of(GameCardColor.RED, GameCardColor.GREEN);
    }
    
    @Override
    public Integer getPlayCost()
    {
        return 13;
    }
    
    @Override
    public Integer getLevel()
    {
        return 6;
    }
    
    @Override
    public Integer getDp()
    {
        return 13000;
    }
    
    @Override
    public DigivolutionForm getForm()
    {
        return DigivolutionForm.MEGA;
    }
    
    @Override
    public DigimonAttribute getAttribute()
    {
        return DigimonAttribute.DATA;
    }
    
    @Override
    public Set<DigimonType> getType()
    {
        return Set.of(DigimonType.DINOSAUR, DigimonType.X_ANTIBODY);
    }
    
    @Override
    public DigivolutionRequirements getDigivolutionRequirements()
    {
        return new DigivolutionRequirements(new DigivolutionRequirement(GameCardColor.RED, 5, 5), new DigivolutionRequirement(GameCardColor.GREEN, 5, 5));
    }
}
