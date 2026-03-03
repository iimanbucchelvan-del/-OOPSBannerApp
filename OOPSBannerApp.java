/**
 * OOPSBannerApp
 * 
 * UC7: Store Character Pattern in an Inner Static Class
 * This program prints "OOPS" in banner format using
 * encapsulated character-pattern objects.
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class that encapsulates
     * a character and its corresponding 7-line pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * 
         * @param character the alphabet character
         * @param pattern   the 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the pattern
         * 
         * @return String array pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to print banner
     * 
     * @param characters array of CharacterPatternMap objects
     */
    public static void printBanner(CharacterPatternMap[] characters) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : characters) {
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        String[] oPattern = {
                "  ****  ",
                " *    * ",
                " *    * ",
                " *    * ",
                " *    * ",
                " *    * ",
                "  ****  "
        };

        // Pattern for P
        String[] pPattern = {
                " *****  ",
                " *    * ",
                " *    * ",
                " *****  ",
                " *      ",
                " *      ",
                " *      "
        };

        // Pattern for S
        String[] sPattern = {
                "  ***** ",
                " *      ",
                " *      ",
                "  ****  ",
                "      * ",
                "      * ",
                " *****  "
        };

        // Create objects
        CharacterPatternMap letterO1 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap letterO2 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap letterP = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap letterS = new CharacterPatternMap('S', sPattern);

        // Store in array
        CharacterPatternMap[] word = { letterO1, letterO2, letterP, letterS };

        // Print banner
        printBanner(word);
    }
}