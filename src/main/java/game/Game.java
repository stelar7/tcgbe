package game;

import game.basic.CardStack;
import game.enums.EffectType;
import game.enums.GameState;
import game.enums.PlayType;
import game.enums.YesNo;

import java.util.*;

public class Game
{
    private final GamePlayer one;
    private final GamePlayer two;
    private       GamePlayer turnPlayer;
    private       boolean    isResolvingEffects = false;

    private final Map<GamePlayer, GameState> state                  = new HashMap<>();
    private final Queue<List<GameEffect>>    pendingActivation      = new ArrayDeque<>();
    private final List<GameEffect>           interruptiveEffects    = new ArrayList<>();
    private final List<GameEffect>           triggeredFromInterrupt = new ArrayList<>();

    public Game(GamePlayer one, GamePlayer two)
    {
        this.one = one;
        this.two = two;
    }

    public GameState getState(GamePlayer player)
    {
        return state.get(player);
    }

    private void setState(GamePlayer player, GameState state)
    {
        this.state.put(player, state);
        player.changeState(state);
    }

    private void setStateAndRunGameLoop(GamePlayer player, GameState state)
    {
        this.state.put(player, state);
        player.changeState(state);
        this.runCommand(player, Map.of());
    }

    private void askPlayerToChooseEffect(List<GameEffect> effectsToTrigger)
    {
        // Run below for turnplayer (until they have no more effects), then for opponent
        // Ask player to choose 1 from "effectsToTrigger"
        // Store effect somewhere to remember it, and remove effect from list
        // Wait for callback
        // Trigger all interruptive effects and add any triggers from them to triggeredFromInterrupt
        // if effect is not negated, do effect
        // add any triggers from it to triggeredFromInterrupt
    }

    private void resolvePendingEffects()
    {
        if (isResolvingEffects)
        {
            if (!interruptiveEffects.isEmpty()) {
                askPlayerToChooseEffect(interruptiveEffects);
                return;
            } else {
                pendingActivation.add(new ArrayList<>(triggeredFromInterrupt));
                triggeredFromInterrupt.clear();
            }

            pendingActivation.removeIf(List::isEmpty);

            if (pendingActivation.isEmpty())
            {
                isResolvingEffects = false;
                return;
            }

            List<GameEffect> lastTriggeredEffects = pendingActivation.peek();
            askPlayerToChooseEffect(lastTriggeredEffects);
            return;
        }
    }

    public void runCommand(GamePlayer player, Map<String, Object> meta)
    {
        if (isResolvingEffects)
        {
            resolvePendingEffects();
            this.runCommand(player, Map.of());
            return;
        }

        GameState playerState = state.getOrDefault(player, GameState.INIT);

        switch (playerState)
        {
            case INIT ->
            {
                setState(player, GameState.SETUP);
                player.deckToSecurity(5);
                player.draw(5);

                setState(player, GameState.MULLIGAN);
            }

            case MULLIGAN ->
            {
                if (getActionYesNo(meta) == YesNo.YES)
                {
                    player.handToDeckBottom(player.getHand());
                    player.draw(5);
                }

                setState(player, GameState.WAITING);

                // Whoever chooses mulligan lasts get to go first lul
                if (state.get(getOtherPlayer(player)) == GameState.WAITING)
                {
                    turnPlayer = player;
                    setStateAndRunGameLoop(player, GameState.START_OF_TURN);
                }
            }

            case START_OF_TURN ->
            {
                setStateAndRunGameLoop(player, GameState.UNSUSPEND);
            }

            case UNSUSPEND ->
            {
                player.getBoard().unsuspend(EffectType.GAME_RULES);

                setStateAndRunGameLoop(player, GameState.DRAW);
            }

            case DRAW ->
            {
                player.draw(1);

                setStateAndRunGameLoop(player, GameState.BREEDING);
            }

            case BREEDING ->
            {
                if (player.getBreeding().hasHatched())
                {
                    setStateAndRunGameLoop(player, GameState.BREEDING_PLAY);
                } else
                {
                    if (player.getBreeding().canHatch())
                    {
                        setStateAndRunGameLoop(player, GameState.BREEDING_HATCH);
                    } else
                    {
                        setStateAndRunGameLoop(player, GameState.MAIN);
                    }
                }
            }

            case BREEDING_PLAY ->
            {
                if (getActionYesNo(meta) == YesNo.YES)
                {
                    CardStack hatched = player.getBreeding().getHatched();
                    player.getBreeding().removeHatched();
                    player.getBoard().play(PlayType.HATCH, hatched);
                }

                setStateAndRunGameLoop(player, GameState.MAIN);
            }

            case BREEDING_HATCH ->
            {
                if (getActionYesNo(meta) == YesNo.YES)
                {
                    player.getBreeding().hatch();
                }

                setStateAndRunGameLoop(player, GameState.MAIN);
            }


            default ->
            {
                System.out.println("Unhandled state " + playerState.name());
                System.out.println("Unhandled state " + playerState.name());
                System.out.println("Unhandled state " + playerState.name());
                System.out.println("Unhandled state " + playerState.name());
            }
        }
    }

    private YesNo getActionYesNo(Map<String, Object> meta)
    {
        String value = meta.get("action").toString();
        if (value.equalsIgnoreCase("Yes"))
        {
            return YesNo.YES;
        }

        if (value.equalsIgnoreCase("No"))
        {
            return YesNo.NO;
        }

        return null;
    }

    private GamePlayer getOtherPlayer(GamePlayer player)
    {
        if (player.equals(one))
        {
            return two;
        }

        return one;
    }

    public GamePlayer getPlayer(String sessionId)
    {
        if (one.getId().equals(sessionId))
        {
            return one;
        }

        if (two.getId().equals(sessionId))
        {
            return two;
        }

        return null;
    }
}
