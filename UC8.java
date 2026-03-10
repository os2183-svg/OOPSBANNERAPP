import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private final char character;
    private final String[] pattern;

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

class BannerRepository {

    private final Map<Character, CharacterPattern> patternMap = new HashMap<>();

    public BannerRepository() {
        loadPatterns();
    }

    private void loadPatterns() {

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
    }

    public CharacterPattern getPattern(char ch) {
        return patternMap.get(ch);
    }
}

public class UC8 {

    public static void main(String[] args) {

        BannerRepository repository = new BannerRepository();
        printBanner("OOPS", repository);
    }

    public static void printBanner(String word, BannerRepository repository) {

        word = word.toUpperCase();

        int height = repository.getPattern(word.charAt(0)).getPattern().length;

        for (int i = 0; i < height; i++) {

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = repository.getPattern(ch);
                System.out.print(cp.getPattern()[i] + "   ");
            }

            System.out.println();
        }
    }
}