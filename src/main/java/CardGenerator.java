import com.google.gson.*;

import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.StringJoiner;

public class CardGenerator
{
    public static void main(String[] args) throws IOException, URISyntaxException
    {
        for (int i = 1; i <= 40; i++)
        {
            String index = String.format("%03d", i);
            String card  = "BT3-" + index;
            String set   = card.split("-")[0];
            String clazz = card.replaceAll("-", "");
            
            Path outPath = Paths.get("C:\\Dropbox\\Private\\workspace\\digi-tcg-ws\\src\\main\\java\\game\\cards\\" + set.toLowerCase() + "\\" + clazz + ".java");
            if (Files.exists(outPath))
            {
                continue;
            }
            
            String     json       = Files.readString(Paths.get("C:\\Users\\stelar7\\Desktop\\digimon\\assets\\data\\" + set + "\\" + card + ".json"), StandardCharsets.UTF_8);
            JsonObject elem       = JsonParser.parseString(json).getAsJsonObject();
            String     outContent = generateClassFromJson(elem);
            
            Files.writeString(outPath, outContent, StandardCharsets.UTF_8, StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW);
            Desktop.getDesktop().browse(new URI("https://digimoncardgame.fandom.com/wiki/" + card));
        }
    }
    
    public static String generateClassFromJson(JsonObject elem)
    {
        String content = """
                package game.cards.%s;
                
                import game.basic.DigivolutionRequirement;
                import game.basic.DigivolutionRequirements;
                import game.basic.GameCard;
                import game.enums.*;
                
                import java.util.Set;
                
                public class %s extends GameCard
                {
                    public %s(String uuid)
                    {
                        super(uuid);
                    }
                    
                    @Override
                    public String getJapaneseName()
                    {
                        return
                    }
                    
                    @Override
                    public String getEnglishName()
                    {
                        return "%s" ;
                    }
                    
                    @Override
                    public String getCardCode()
                    {
                        return "%s";
                    }
                    
                    @Override
                    public GameCardType getCardType()
                    {
                        return GameCardType.%s;
                    }
                    
                    @Override
                    public Set<GameCardColor> getColors()
                    {
                        return Set.of(%s);
                    }
                    
                    @Override
                    public Integer getPlayCost()
                    {
                        return %s;
                    }
                    
                    @Override
                    public Integer getLevel()
                    {
                        return %s;
                    }
                    
                    @Override
                    public Integer getDp()
                    {
                        return %s;
                    }
                    
                    @Override
                    public DigivolutionForm getForm()
                    {
                        return %s;
                    }
                    
                    @Override
                    public DigimonAttribute getAttribute()
                    {
                        return %s;
                    }
                    
                    @Override
                    public Set<DigimonType> getType()
                    {
                        return %s;
                    }
                    
                    @Override
                    public DigivolutionRequirements getDigivolutionRequirements()
                    {
                        return %s;
                    }
                }
                """;
        
        String code        = elem.get("card_number").getAsString();
        String packag      = code.split("-")[0].toLowerCase();
        String clazz       = code.replaceAll("-", "").toUpperCase();
        String englishName = elem.get("name").getAsString();
        String cardType    = elem.get("card_type").getAsString().toUpperCase();
        String cost        = elem.get("cost") == null ? "null" : elem.get("cost").getAsString();
        String level       = elem.get("level") == null ? "null" : elem.get("level").getAsString();
        String dp          = elem.get("power") == null ? "null" : elem.get("power").getAsString();
        String form        = (elem.get("stage") == null || elem.get("stage").getAsString().isEmpty() || elem.get("stage").getAsString().equalsIgnoreCase("baby")) ? "null" : "DigivolutionForm." + elem.get("stage").getAsString().toUpperCase().replaceAll(" ", "_").replace("-", "_");
        String attribute   = (elem.get("attribute") == null  || elem.get("attribute").getAsString().isEmpty()) ? "null" : "DigimonAttribute." + elem.get("attribute").getAsString().toUpperCase().replaceAll(" ", "_").replace("-", "_");
        
        StringJoiner color      = new StringJoiner(", ");
        JsonArray    colorArray = elem.get("color").getAsJsonArray();
        for (JsonElement col : colorArray)
        {
            color.add("GameCardColor." + col.getAsString().toUpperCase());
        }
        
        String       typeArray = elem.get("type") == null ? "null" : elem.get("type").getAsString();
        StringJoiner type      = new StringJoiner(", ");
        for (String typ : typeArray.split("/"))
        {
            String realType = typ.trim().toUpperCase().replaceAll(" ", "_").replace("-", "_");
            type.add("DigimonType." + realType);
        }
        
        String endType = "null";
        if (!typeArray.equals("null"))
        {
            endType = "Set.of(" + type + ")";
        }
        
        StringJoiner evolutions    = new StringJoiner(", ");
        JsonArray    digivolves    = elem.get("digivolves_from") != null ? elem.get("digivolves_from").getAsJsonArray() : new JsonArray();
        String       evolveContent = "null";
        for (JsonElement digivolve : digivolves)
        {
            String digiCost  = digivolve.getAsJsonObject().get("cost").getAsString();
            String digiColor = digivolve.getAsJsonObject().get("requirements").getAsJsonObject().get("color").getAsString().toUpperCase();
            if (digiColor.isEmpty()) {
                break;
            }
            String digiLevel = digivolve.getAsJsonObject().get("requirements").getAsJsonObject().get("level").getAsString();
            evolutions.add("new DigivolutionRequirement(GameCardColor." + digiColor + "," + digiCost + "," + digiLevel + ")");
        }
        
        if (digivolves.size() > 0)
        {
            evolveContent = "new DigivolutionRequirements(" + evolutions + ")";
        }
        
        return content.formatted(packag, clazz, clazz, englishName, code, cardType, color.toString(), cost, level, dp, form, attribute, endType, evolveContent);
    }
    
}
