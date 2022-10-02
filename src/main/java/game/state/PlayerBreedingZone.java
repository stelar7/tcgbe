package game.state;

import game.basic.CardStack;
import game.basic.GameCard;

import java.util.List;

public class PlayerBreedingZone
{
    private final PlayerDeck deck;
    private       CardStack  hatched;
    
    public PlayerBreedingZone(List<GameCard> cards)
    {
        this.deck = new PlayerDeck(cards);
    }
    
    public CardStack getHatched()
    {
        return hatched;
    }
    
    public void removeHatched()
    {
        this.hatched = null;
    }
    
    public boolean canHatch()
    {
        return hatched == null && deck.size() > 0;
    }
    
    public void hatch()
    {
        GameCard toHatch = deck.removeFirst();
        hatched = new CardStack(toHatch);
    }
    
    public boolean hasHatched()
    {
        return this.hatched != null;
    }
}
