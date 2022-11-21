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
    GIANT_BIRD("巨鳥型"),
    UNIDENTIFIED("不明型"),
    FIRE_DRAGON( "火炎竜型"),
    EARTH_DRAGON("地竜型"),
    CYBORG("サイボーグ型"),
    BIRDKIN("鳥人型"),
    UNDEAD("アンデッド型"),
    DRAGONKIN("竜人型"),
    MACHINE_DRAGON("機竜型");


    final String japanese;

    DigimonType(String japanese)
    {
        this.japanese = japanese;
    }
}
