package game;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import game.basic.GameCard;
import game.enums.GameCardType;
import game.enums.GameState;
import game.state.*;
import game.enums.GameEvent;

import java.util.*;

public class GamePlayer
{
    private final UserSession session;
    
    private final PlayerBoard        board;
    private final PlayerSecurity     security;
    private final PlayerHand         hand;
    private final PlayerGrave        grave;
    private final PlayerDeck         deck;
    private final PlayerBreedingZone breeding;
    
    public GamePlayer(UserSession session, List<GameCard> cardCodes)
    {
        this.session = session;
        
        List<GameCard> normalDeck = cardCodes.stream().filter(c -> c.getCardType() != GameCardType.DIGITAMA).toList();
        PlayerDeck     eggDeck    = new PlayerDeck(cardCodes.stream().filter(c -> c.getCardType() == GameCardType.DIGITAMA).toList());
        
        this.deck = new PlayerDeck(normalDeck);
        this.breeding = new PlayerBreedingZone(this, eggDeck);
        this.grave = new PlayerGrave();
        this.hand = new PlayerHand();
        this.board = new PlayerBoard();
        this.security = new PlayerSecurity();
    }
    
    public void deckToSecurity(int count)
    {
        for (int i = 0; i < count && !deck.isEmpty(); i++)
        {
            GameCard drawn = deck.removeFirst();
            session.emitEvent(GameEvent.REMOVE_FROM_DECK, Map.of("id", drawn.getUUID()));
            
            security.add(drawn);
            session.emitEvent(GameEvent.ADD_TO_SECURITY, Map.of("id", drawn.getUUID()));
        }
    }
    
    public void handToDeckBottom(List<GameCard> cards)
    {
        for (GameCard card : new ArrayList<>(cards))
        {
            hand.remove(card);
            session.emitEvent(GameEvent.REMOVE_FROM_HAND, Map.of("id", card.getUUID()));
            
            deck.addLast(card);
            session.emitEvent(GameEvent.TO_DECK_BOTTOM, Map.of("id", card.getUUID()));
        }
    }
    
    public void draw(int count)
    {
        for (int i = 0; i < count && !deck.isEmpty(); i++)
        {
            GameCard drawn = deck.removeFirst();
            session.emitEvent(GameEvent.REMOVE_FROM_DECK, Map.of("id", drawn.getUUID()));
            
            hand.add(drawn);
            session.emitEvent(GameEvent.ADD_TO_HAND, Map.of("id", drawn.getUUID()));
        }
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
    
    public void changeState(GameState state)
    {
        session.emitEvent(GameEvent.STATE_CHANGE, Map.of("state", state.name()));
    }
    
    
    public void askEffect(String prompt, List<GameEffect> effectChoices)
    {
        JsonArray values = new JsonArray();
        for (GameEffect choice : effectChoices)
        {
            JsonObject params = new JsonObject();
            params.addProperty("id", choice.getUUID().toString());
            params.addProperty("text", choice.getEffectText());
            values.add(params);
        }
        
        session.emitEvent(GameEvent.ASK_EFFECT, Map.of("values", values.toString()));
    }
}
