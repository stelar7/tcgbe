package game;

import game.GameEffect;
import game.GamePlayer;

import java.util.*;

public class GameEffectManager
{
    private boolean isResolvingEffects = false;

    private final Queue<List<GameEffect>> pendingActivation         = new ArrayDeque<>();
    private final Queue<List<GameEffect>> interruptiveEffects       = new ArrayDeque<>();
    private final List<GameEffect>        triggeredFromInterrupt    = new ArrayList<>();
    private final Set<UUID>               effectsTriggeredThisChain = new HashSet<>();

    public void askPlayerToChooseEffect(GamePlayer turnPlayer, GamePlayer opponent, List<GameEffect> effectsToTrigger)
    {
        GamePlayer       choosing      = turnPlayer;
        List<GameEffect> effectChoices = effectsToTrigger.stream().filter(e -> e.getActivator().getOwner().equals(turnPlayer)).toList();
        if (effectChoices.isEmpty())
        {
            // No turn-player effects, so check opponent
            choosing      = opponent;
            effectChoices = effectsToTrigger.stream().filter(e -> e.getActivator().getOwner().equals(opponent)).toList();

            if (effectChoices.isEmpty())
            {
                // We should never be here...
                return;
            }
        }

        choosing.askEffect("Select effect to activate", effectChoices);

        // Wait for callback
        // Add selected effect to "effectsTriggeredThisChain"
        // Store effect somewhere to remember it, and remove effect from list
        // Trigger all interruptive effects
        // If a triggered effect is in "effectsTriggeredThisChain", and is interruptive, cancel the trigger
        // If there is a triggered effect, resolve that effect
        // If there are no more interruptive effects, and its effect is not negated, do effect
        // Add any triggers from it to triggeredFromInterrupt
        // Resolve those effects too
    }

    public void resolvePendingEffects(GamePlayer turnPlayer, GamePlayer opponent, Map<String, Object> meta)
    {
        isResolvingEffects = true;

        // Resolve any pending interrupts
        interruptiveEffects.removeIf(List::isEmpty);
        if (interruptiveEffects.isEmpty())
        {
            pendingActivation.add(new ArrayList<>(triggeredFromInterrupt));
            triggeredFromInterrupt.clear();
        } else
        {
            List<GameEffect> lastTriggeredInterrupt = interruptiveEffects.peek();
            askPlayerToChooseEffect(turnPlayer, opponent, lastTriggeredInterrupt);
            return;
        }

        // If we are trying to resolve a new effect, allow all interrupts to happen again
        effectsTriggeredThisChain.clear();

        // Resolve any pending effects
        pendingActivation.removeIf(List::isEmpty);
        if (pendingActivation.isEmpty())
        {
            isResolvingEffects = false;
            return;
        }

        List<GameEffect> lastTriggeredEffects = pendingActivation.peek();
        askPlayerToChooseEffect(turnPlayer, opponent, lastTriggeredEffects);
    }

    public boolean isResolvingEffects()
    {
        return isResolvingEffects;
    }
}
