package game.state;

import game.enums.EffectType;
import game.basic.CardStack;
import game.enums.PlayType;

import java.util.ArrayList;

public class PlayerBoard extends ArrayList<CardStack>
{
    public void unsuspend(EffectType reason)
    {
        for (CardStack c : this)
        {
        }
    }
    
    public void play(PlayType source, CardStack card)
    {
        this.add(card);
    }
}
