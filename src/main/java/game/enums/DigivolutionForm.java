package game.enums;

public enum DigivolutionForm
{
    IN_TRAINING("幼年期"),
    ROOKIE("成長期"),
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
