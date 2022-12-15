package game.enums;

public enum DigivolutionForm
{
    ARMOR_FORM("アーマー体"),
    CHAMPION("成熟期"),
    D_REAPER("デ・リーパー"),
    HYBRID("ハイブリッド体"),
    IN_TRAINING("幼年期"),
    MEGA("究極体"),
    ROOKIE("成長期"),
    ULTIMATE("完全体"),
    UNKNOWN("不明"),
    ;


    private final String japanese;

    DigivolutionForm(String japanese)
    {
        this.japanese = japanese;
    }

    public String getJapanese()
    {
        return japanese;
    }
}
