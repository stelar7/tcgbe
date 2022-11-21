package game;

import game.basic.CardStack;
import game.enums.EffectOutcome;
import game.enums.GameZone;

import java.util.UUID;
import java.util.function.Function;

public class GameEffect
{
    private CardStack                     activator;
    private GameZone                      requiredZone;
    private Function<Game, EffectOutcome> effect;
    private boolean                       isInterruptive;
    private UUID                          uuid;
    private String                        effectText;

    public GameEffect(
            CardStack activator,
            GameZone requiredZone,
            boolean isInterruptive,
            Function<Game, EffectOutcome> effect,
            String effectText)
    {
        this.activator      = activator;
        this.requiredZone   = requiredZone;
        this.isInterruptive = isInterruptive;
        this.effect         = effect;
        this.effectText     = effectText;

        this.uuid = UUID.randomUUID();
    }

    public CardStack getActivator()
    {
        return activator;
    }

    public GameZone getRequiredZone()
    {
        return requiredZone;
    }

    public Function<Game, EffectOutcome> getEffect()
    {
        return effect;
    }

    public boolean isInterruptive()
    {
        return isInterruptive;
    }

    public UUID getUUID()
    {
        return uuid;
    }

    public String getEffectText()
    {
        return effectText;
    }
}
