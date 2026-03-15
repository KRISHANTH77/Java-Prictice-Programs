public class OOPSBannerApp {

    // Static inner class to store character and pattern
    static class CharacterPattern {

        char character;
        String[] pattern;

        // Constructor
        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Define patterns
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " *** ",
                "*     *",
                "*     *",
                "*     *",
                " *** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "***  ",
                "*    * ",
                "***  ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " *** ",
                "*      ",
                " *** ",
                "      *",
                " *** "
        });

        // Banner word
        CharacterPattern[] banner = {O, O, P, S};

        // Print banner
        for (int i = 0; i < 5; i++) {

            for (CharacterPattern cp : banner) {
                System.out.print(cp.getPattern()[i] + " ");
            }

            System.out.println();
        }
    }
}