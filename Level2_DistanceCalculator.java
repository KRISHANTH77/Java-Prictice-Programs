public class Level2_DistanceCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double speed;
        double time;
        double distance;

        System.out.println("Enter speed:");
        speed = input.nextDouble();

        System.out.println("Enter time:");
        time = input.nextDouble();

        distance = speed * time;

        System.out.println("Distance = " + distance);

        input.close();
    }
}