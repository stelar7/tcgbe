package game.basic;

import game.GamePlayer;

public class CardStack
{
    private GamePlayer owner;

    public CardStack(GamePlayer owner)
    {
        this.owner = owner;
    }

    public GamePlayer getOwner()
    {
        return owner;
    }
}
