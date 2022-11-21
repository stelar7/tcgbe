package game.basic;

import game.enums.GameCardColor;

public class DigivolutionRequirement
{
    private GameCardColor color;
    private Integer       level;
    private Integer       cost;

    public DigivolutionRequirement(GameCardColor color, Integer level, Integer cost)
    {
        this.color = color;
        this.level = level;
        this.cost  = cost;
    }
}
