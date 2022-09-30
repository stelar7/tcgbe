package game.state;

import game.basic.GameCard;

import java.util.ArrayDeque;
import java.util.List;

public class PlayerDeck extends ArrayDeque<GameCard> {
    public PlayerDeck(List<GameCard> cards) {
        this.addAll(cards);
    }
}
