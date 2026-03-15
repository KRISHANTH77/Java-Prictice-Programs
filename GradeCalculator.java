/**
 * Program: GradeCalculator
 * Description: Determines grade based on marks
 */

public class GradeCalculator {

    public static void main(String[] args) {

        // Declare variable
        int marks = 78;

        // Conditional statements
        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }

    }
}