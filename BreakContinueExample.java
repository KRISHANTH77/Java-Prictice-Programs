public class BreakContinueExample {

    public static void main(String[] args) {

        // Variable declaration
        int limit = 10;

        // For loop
        for (int i = 1; i <= limit; i++) {

            // Skip number 5
            if (i == 5) {
                continue;
            }

            // Stop loop at 8
            if (i == 8) {
                break;
            }

            // Print number
            System.out.println(i);
        }

    }
}