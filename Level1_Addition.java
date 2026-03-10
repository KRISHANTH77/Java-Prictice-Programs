public class Level1_Addition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int result;

        System.out.println("Enter first number:");
        number1 = input.nextInt();

        System.out.println("Enter second number:");
        number2 = input.nextInt();

        result = number1 + number2;

        System.out.println("Sum = " + result);

        input.close();
    }
}