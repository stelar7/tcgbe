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

    private GamePlayer turnPlayer;

    private final GameEffectManager effectManager;

    private final Map<GamePlayer, GameState> state = new HashMap<>();

    public Game(GamePlayer one, GamePlayer two)
    {
        this.one = one;
        this.two = two;

        effectManager = new GameEffectManager();
    }

    public GameState getState(GamePlayer player)
    {
        return state.getOrDefault(player, GameState.INIT);
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

    public void runCommand(GamePlayer player, Map<String, Object> meta)
    {
        if (effectManager.isResolvingEffects())
        {
            effectManager.resolvePendingEffects(turnPlayer, getOtherPlayer(turnPlayer), meta);
            this.runCommand(player, meta);
            return;
        }

        GameState playerState = getState(player);

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

                // Let the last player to mulligan go first
                if (getState(getOtherPlayer(player)) == GameState.WAITING)
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
                    setState(player, GameState.BREEDING_PLAY);
                } else
                {
                    if (player.getBreeding().canHatch())
                    {
                        setState(player, GameState.BREEDING_HATCH);
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

                setState(player, GameState.MAIN);
            }

            case BREEDING_HATCH ->
            {
                if (getActionYesNo(meta) == YesNo.YES)
                {
                    player.getBreeding().hatch();
                }

                setState(player, GameState.MAIN);
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
