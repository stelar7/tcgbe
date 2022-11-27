package game.basic;

import game.GamePlayer;

import java.util.*;

public class CardStack
{
    private final Deque<GameCard> cardsInStack = new ArrayDeque<>();
    
    private final GamePlayer owner;
    
    public CardStack(GamePlayer owner)
    {
        this.owner = owner;
    }
    
    public GamePlayer getOwner()
    {
        return owner;
    }
    
    public void addCardToTopOfStack(GameCard card)
    {
        cardsInStack.addFirst(card);
    }
    
    public GameCard removeCardFromTopOfStack()
    {
        return cardsInStack.removeFirst();
    }
    
    public void addCardToBottomOfStack(GameCard card)
    {
        cardsInStack.addLast(card);
    }
    
    public GameCard removeCardFromBottomOfStack()
    {
        return cardsInStack.removeLast();
    }
}
