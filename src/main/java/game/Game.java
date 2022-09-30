package game;

import game.basic.CardStack;
import game.enums.EffectType;
import game.enums.GameState;
import game.enums.PlayType;
import game.enums.YesNo;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private GamePlayer one;
    private GamePlayer two;

    private GamePlayer turnPlayer;
    private Map<GamePlayer, GameState> state = new HashMap<>();

    public Game(GamePlayer one, GamePlayer two) {
        this.one = one;
        this.two = two;
    }

    public GameState getState(GamePlayer player) {
        return state.get(player);
    }

    private void setState(GamePlayer player, GameState state) {
        this.state.put(player, state);
        player.changeState(state);
    }

    public void runCommand(GamePlayer player, Map<String, Object> meta) {
        GameState playerState = state.get(player);

        switch (playerState) {
            case INIT -> {
                setState(player, GameState.SETUP);
                player.deckToSecurity(5);
                player.draw(5);

                setState(player, GameState.MULLIGAN);
            }

            case MULLIGAN -> {
                if (getActionYesNo(meta) == YesNo.YES) {
                    player.handToDeckBottom(player.getHand());
                    player.draw(5);
                }

                setState(player, GameState.WAITING);

                // Whoever chooses mulligan lasts get to go first lul
                if (state.get(getOtherPlayer(player)) == GameState.WAITING) {
                    turnPlayer = player;
                    setState(player, GameState.START_OF_TURN);
                }
            }

            case START_OF_TURN -> {
                setState(player, GameState.UNSUSPEND);
            }

            case UNSUSPEND -> {
                player.getBoard().unsuspend(EffectType.GAME_RULES);

                setState(player, GameState.DRAW);
            }

            case DRAW -> {
                player.draw(1);

                setState(player, GameState.BREEDING);
            }

            case BREEDING -> {
                if (player.getBreeding().hasHatched()) {
                    setState(player, GameState.BREEDING_PLAY);
                } else {
                    if (player.getBreeding().canHatch()) {
                        setState(player, GameState.BREEDING_HATCH);
                    } else {
                        setState(player, GameState.MAIN);
                    }
                }
            }

            case BREEDING_PLAY -> {
                if (getActionYesNo(meta) == YesNo.YES) {
                    CardStack hatched = player.getBreeding().getHatched();
                    player.getBreeding().removeHatched();
                    player.getBoard().play(PlayType.HATCH, hatched);
                }

                setState(player, GameState.MAIN);
            }

            case BREEDING_HATCH -> {
                if (getActionYesNo(meta) == YesNo.YES) {
                    player.getBreeding().hatch();
                }

                setState(player, GameState.MAIN);
            }


            default -> {
                System.out.println("Unhandled state " + playerState.name());
                System.out.println("Unhandled state " + playerState.name());
                System.out.println("Unhandled state " + playerState.name());
                System.out.println("Unhandled state " + playerState.name());
            }
        }
    }

    private YesNo getActionYesNo(Map<String, Object> meta) {
        String value = meta.get("action").toString();
        if (value.equalsIgnoreCase("Yes")) {
            return YesNo.YES;
        }

        if (value.equalsIgnoreCase("No")) {
            return YesNo.NO;
        }

        return null;
    }

    private GamePlayer getOtherPlayer(GamePlayer player) {
        if (player.equals(one)) {
            return two;
        }

        return one;
    }

    public GamePlayer getPlayer(String sessionId) {
        if (one.getId().equals(sessionId)) {
            return one;
        }

        if (two.getId().equals(sessionId)) {
            return two;
        }

        return null;
    }
}
