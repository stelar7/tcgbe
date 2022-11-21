package game.enums;

public enum DigivolutionForm
{
    IN_TRAINING("幼年期"),
    ROOKIE("成長期"),
    CHAMPION("成熟期"),
    ARMOR_FORM("アーマー体"),
    D_REAPER("デ・リーパー"),
    HYBRID("ハイブリッド体"),
    ULTIMATE("完全体"),
    MEGA("究極体"),
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
