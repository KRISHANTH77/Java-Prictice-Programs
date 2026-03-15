public class MultiplicationTable {

    public static void main(String[] args) {

        // Declare variables
        int number = 5;
        int counter = 1;

        // While loop
        while (counter <= 10) {

            int result = number * counter;

            System.out.println(number + " x " + counter + " = " + result);

            counter++;

        }

    }
}
