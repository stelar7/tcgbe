package game.basic;

import game.enums.GameCardColor;
import game.enums.GameCardType;

import java.util.Set;
import java.util.UUID;


public class GameCard {
    private String name;
    private String cardCode;
    private GameCardType cardType;
    private Set<GameCardColor> colors;
    private Integer playCost;
    private Integer level;
    private Integer dp;
    private String form;
    private String attribute;
    private String type;

    private String uuid;

    public GameCard(String name, String cardCode, GameCardType cardType, Set<GameCardColor> colors, Integer playCost, Integer level, Integer dp, String form, String attribute, String type) {
        this.name = name;
        this.cardCode = cardCode;
        this.cardType = cardType;
        this.colors = colors;
        this.playCost = playCost;
        this.level = level;
        this.dp = dp;
        this.form = form;
        this.attribute = attribute;
        this.type = type;

        this.uuid = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getCardCode() {
        return cardCode;
    }

    public GameCardType getCardType() {
        return cardType;
    }

    public Set<GameCardColor> getColors() {
        return colors;
    }

    public Integer getPlayCost() {
        return playCost;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getDp() {
        return dp;
    }

    public String getForm() {
        return form;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getType() {
        return type;
    }

    public String getUUID() {
        return uuid;
    }
}
