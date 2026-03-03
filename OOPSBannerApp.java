import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  ****  ",
                " *    * ",
                " *    * ",
                " *    * ",
                " *    * ",
                " *    * ",
                "  ****  "
        });

        patternMap.put('P', new String[]{
                " *****  ",
                " *    * ",
                " *    * ",
                " *****  ",
                " *      ",
                " *      ",
                " *      "
        });

        patternMap.put('S', new String[]{
                "  ***** ",
                " *      ",
                " *      ",
                "  ****  ",
                "      * ",
                "      * ",
                " *****  "
        });

        return patternMap;
    }

    public static void printBanner(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char letter = message.charAt(i);
                String[] pattern = patternMap.get(letter);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterMap();
        String message = "OOPS";
        printBanner(message, patternMap);
    }
}