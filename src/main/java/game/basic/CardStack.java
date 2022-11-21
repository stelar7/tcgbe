package game.basic;

import game.enums.EffectType;
import game.enums.GameCardColor;
import game.enums.SuspendState;

import java.util.Set;

public class CardStack
{
    private SuspendState state = SuspendState.UNSUSPENDED;
    
    private Set<String>        names;
    private Set<GameCardColor> colors;
    private Integer            dp;
    private Integer            level;
    
    public CardStack(GameCard initial)
    {
    
    }
    
    
    public void unsusped(EffectType reason)
    {
        this.state = SuspendState.UNSUSPENDED;
    }
}
