/**
 * Program: NumberTypeChecker
 * Description: Check if a number is positive, negative or zero
 */

public class NumberTypeChecker {

    public static void main(String[] args) {

        // Declare variable
        int number = -5;

        // Boolean expressions
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;

        // Conditional statements
        if (isPositive) {
            System.out.println("Number is Positive");
        }
        else if (isNegative) {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is Zero");
        }

    }
}