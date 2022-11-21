package game.enums;

public enum DigimonType
{
    BABY_DRAGON("幼竜型"),
    BULB("球根型"),
    AMPHIBIAN("両生類型"),
    LESSER("レシサー型"),
    MINI_ANGEL("小天使型"),
    MINI_DRAGON("小竜型"),
    REPTILE("爬虫類型"),
    DINOSAUR("恐竜型"),
    BIRD("ヒナ鳥型"),
    AVIAN("鳥型"),
    ;


    final String japanese;

    DigimonType(String japanese)
    {
        this.japanese = japanese;
    }
}
