package game;

import game.basic.GameCard;
import game.enums.GameCardType;
import game.enums.GameState;
import game.state.*;
import game.enums.GameEvent;

import java.util.List;
import java.util.Map;

public class GamePlayer
{
    private final UserSession session;
    
    private int turnCount = 0;
    
    private final PlayerBoard        board;
    private final PlayerSecurity     security;
    private final PlayerHand         hand;
    private final PlayerGrave        grave;
    private final PlayerDeck         deck;
    private final PlayerBreedingZone breeding;
    
    public GamePlayer(UserSession session, List<GameCard> cardCodes)
    {
        this.session = session;
        
        this.deck = new PlayerDeck(cardCodes.stream().filter(c -> c.getCardType() != GameCardType.DIGITAMA).toList());
        this.breeding = new PlayerBreedingZone(cardCodes.stream().filter(c -> c.getCardType() == GameCardType.DIGITAMA).toList());
        this.grave = new PlayerGrave();
        this.hand = new PlayerHand();
        this.board = new PlayerBoard();
        this.security = new PlayerSecurity();
    }
    
    public void deckToSecurity(int count)
    {
        int i = 0;
        while (i < count && !deck.isEmpty())
        {
            GameCard drawn = deck.removeFirst();
            session.emitEvent(GameEvent.REMOVE_FROM_DECK, Map.of("id", drawn.getUUID()));
            
            security.add(drawn);
            session.emitEvent(GameEvent.ADD_TO_SECURITY, Map.of("id", drawn.getUUID()));
        }
    }
    
    public void handToDeckBottom(List<GameCard> cards)
    {
        for (GameCard card : cards)
        {
            hand.remove(card);
            session.emitEvent(GameEvent.REMOVE_FROM_HAND, Map.of("id", card.getUUID()));
            
            deck.addLast(card);
            session.emitEvent(GameEvent.TO_DECK_BOTTOM, Map.of("id", card.getUUID()));
        }
    }
    
    public void draw(int count)
    {
        int i = 0;
        while (i < count && !deck.isEmpty())
        {
            GameCard drawn = deck.removeFirst();
            session.emitEvent(GameEvent.REMOVE_FROM_DECK, Map.of("id", drawn.getUUID()));
            
            hand.add(drawn);
            session.emitEvent(GameEvent.ADD_TO_HAND, Map.of("id", drawn.getUUID()));
        }
    }
    
    public void ask(String query)
    {
        session.emitEvent(GameEvent.ASK, Map.of("content", query));
    }
    
    public void changeState(GameState state)
    {
        session.emitEvent(GameEvent.STATE_CHANGE, Map.of("state", state.name()));
    }
    
    public PlayerBoard getBoard()
    {
        return board;
    }
    
    public PlayerSecurity getSecurity()
    {
        return security;
    }
    
    public PlayerHand getHand()
    {
        return hand;
    }
    
    public PlayerGrave getGrave()
    {
        return grave;
    }
    
    public PlayerDeck getDeck()
    {
        return deck;
    }
    
    public PlayerBreedingZone getBreeding()
    {
        return breeding;
    }
    
    public String getId()
    {
        return session.session().getId();
    }
}
