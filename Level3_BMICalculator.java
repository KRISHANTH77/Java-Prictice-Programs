public class Level3_BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double height;
        double bmi;

        System.out.println("Enter weight in kilograms:");
        weight = input.nextDouble();

        System.out.println("Enter height in meters:");
        height = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your BMI = " + bmi);

        input.close();
    }
}