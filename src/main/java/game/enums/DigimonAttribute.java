package game.enums;

public enum DigimonAttribute
{
    DATA("データ"),
    FREE("フリー"),
    UNKNOWN("不明"),
    VACCINE("ワクチン"),
    VARIABLE("ヴァリアブル種"),
    VIRUS("ウィルス"),
    ;

    private final String japanese;

    DigimonAttribute(String japanese)
    {
        this.japanese = japanese;
    }

    public String getJapanese()
    {
        return japanese;
    }
}
