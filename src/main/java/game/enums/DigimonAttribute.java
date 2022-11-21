package game.enums;

public enum DigimonAttribute
{
    VACCINE("ワクチン"),
    DATA("データ"),
    UNKNOWN("不明"),
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
