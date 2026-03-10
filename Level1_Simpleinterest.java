public class Level1_SimpleInterest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal;
        double rate;
        double time;
        double simpleInterest;

        System.out.println("Enter Principal Amount:");
        principal = input.nextDouble();

        System.out.println("Enter Rate of Interest:");
        rate = input.nextDouble();

        System.out.println("Enter Time (in years):");
        time = input.nextDouble();

        simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        input.close();
    }
}