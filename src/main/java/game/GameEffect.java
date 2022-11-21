package game;

import game.basic.CardStack;
import game.enums.EffectOutcome;
import game.enums.GameZone;

import java.util.function.Function;

public class GameEffect
{
    private CardStack                     activator;
    private GameZone                      requiredZone;
    private Function<Game, EffectOutcome> effect;
    private boolean                       isInterruptive;

    public GameEffect(CardStack activator, GameZone requiredZone, boolean isInterruptive, Function<Game, EffectOutcome> effect)
    {
        this.activator      = activator;
        this.requiredZone   = requiredZone;
        this.isInterruptive = isInterruptive;
        this.effect         = effect;
    }
}
