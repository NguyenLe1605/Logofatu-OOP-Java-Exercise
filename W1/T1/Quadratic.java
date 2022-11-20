import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a * c);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a * c);
            System.out.println("The equation has two roots");
            System.out.println(root1);
            System.out.println(root2);
        } else if ((int) delta == 0) {
            double root = -b / (2 * a * c);
            System.out.println("The equation has one root");
            System.out.println(root);
        } else {
            System.out.println("The equation returns no root");
        }
    }
}