package game.basic;

import java.util.ArrayList;
import java.util.List;

public class DigivolutionRequirements
{
    List<DigivolutionRequirement> normalRequirements = new ArrayList<>();
    List<DigivolutionRequirement> nameRequirements = new ArrayList<>();
    List<DigivolutionRequirement> jogressRequirements = new ArrayList<>();

    public DigivolutionRequirements(DigivolutionRequirement... normalRequirements)
    {
        this.normalRequirements = List.of(normalRequirements);
    }
}
