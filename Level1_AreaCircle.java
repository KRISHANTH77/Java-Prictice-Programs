public class Level1_AreaCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;
        double area;

        System.out.println("Enter radius of the circle:");
        radius = input.nextDouble();

        area = 3.14 * radius * radius;

        System.out.println("Area of Circle = " + area);

        input.close();
    }
}