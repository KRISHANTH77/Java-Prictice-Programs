public class Level2_TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Enter temperature in Celsius:");
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

        input.close();
    }
}