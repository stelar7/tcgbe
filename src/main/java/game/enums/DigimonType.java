package game.enums;

public enum DigimonType
{
    AMPHIBIAN("両生類型"),
    ANCIENT_ANIMAL("古代獣型"),
    ANGEL("天使型"),
    ARCHANGEL("大天使型"),
    AUTHORITY("能天使型"),
    AVIAN("鳥型"),
    BABY_DRAGON("幼竜型"),
    BEAST("獣型"),
    BEASTKIN("獣人型"),
    BIRD("ヒナ鳥型"),
    BIRDKIN("鳥人型"),
    BULB("球根型"),
    CARNIVOROUS_PLANT("食虫植物型"),
    CHERUB("智天使型"),
    CYBORG("サイボーグ型"),
    DARK_ANIMAL("魔獸型"),
    DEMON("鬼人型"),
    DINOSAUR("恐竜型"),
    DRAGONKIN("竜人型"),
    EARTH_DRAGON("地竜型"),
    FAIRY("妖精型"),
    FIRE_DRAGON("火炎竜型"),
    GIANT_BIRD("巨鳥型"),
    HOLY_BEAST("聖獣型"),
    HOLY_WARRIOR("聖騎士型"),
    ICE_SNOW("氷雪型"),
    INSECTOID("昆虫型"),
    LESSER("レシサー型"),
    MACHINE("マシーン型"),
    MACHINE_DRAGON("機竜型"),
    MAGIC_WARRIOR("魔法戦士型"),
    MAMMAL("哺乳類型"),
    MINI_ANGEL("小天使型"),
    MINI_DRAGON("小竜型"),
    MYTHICAL_DRAGON("幻竜型"),
    PERFECT("パーフェクト型"),
    PUPPET("パペット型"),
    REPTILE("爬虫類型"),
    ROYAL_KNIGHT("ロイヤルナイツ"),
    SEA_ANIMAL("水棲哺乳類型"),
    SEA_BEAST("海獣型"),
    SERAPH("熾天使型"),
    SHAMAN("神人型"),
    THREE_GREAT_ANGELS("三大天使"),
    UNDEAD("アンデッド型"),
    UNIDENTIFIED("不明型"),
    VEGETATION("植物型"),
    MUTANT("突然変異型"),
    XROS_HEART("クロスハート"),
    ROCK_DRAGON("岩竜型"),
    DARK_DRAGON("魔竜型"),
    HOLY_DRAGON("聖竜型");
    
    
    final String japanese;
    
    DigimonType(String japanese)
    {
        this.japanese = japanese;
    }
}
