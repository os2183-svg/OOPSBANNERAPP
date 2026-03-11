import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class UC7 {

    public static void main(String[] args) {

        // Store character mappings
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        }));

        String text = "OOPS";

        int height = patternMap.get('O').getPattern().length;

        for (int i = 0; i < height; i++) {
            for (char ch : text.toCharArray()) {
                System.out.print(patternMap.get(ch).getPattern()[i] + "   ");
            }
            System.out.println();
        }
    }
}