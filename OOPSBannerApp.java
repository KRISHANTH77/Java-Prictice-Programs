public class OOPSBannerApp {

    // Static method for letter O
    public static String[] getO() {
        return new String[]{
            " *** ",
            "*     *",
            "*     *",
            "*     *",
            " *** "
        };
    }

    // Static method for letter P
    public static String[] getP() {
        return new String[]{
            "***  ",
            "*    * ",
            "***  ",
            "*      ",
            "*      "
        };
    }

    // Static method for letter S
    public static String[] getS() {
        return new String[]{
            " *** ",
            "*      ",
            " *** ",
            "      *",
            " *** "
        };
    }

    public static void main(String[] args) {

        String[] O1 = getO();
        String[] O2 = getO();
        String[] P = getP();
        String[] S = getS();

        for(int i = 0; i < O1.length; i++) {
            System.out.println(O1[i] + " " + O2[i] + " " + P[i] + " " + S[i]);
        }
    }
}