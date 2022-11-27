package game.state;

import game.GamePlayer;
import game.basic.*;

public class PlayerBreedingZone
{
    private final GamePlayer owner;
    private final PlayerDeck deck;
    private       CardStack  hatched;
    
    public PlayerBreedingZone(GamePlayer owner, PlayerDeck deck)
    {
        this.owner = owner;
        this.deck = deck;
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
        hatched = new CardStack(owner);
        
        GameCard toHatch = deck.removeFirst();
        hatched.addCardToTopOfStack(toHatch);
    }
    
    public boolean hasHatched()
    {
        return this.hatched != null;
    }
}
