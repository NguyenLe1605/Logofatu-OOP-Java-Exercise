import java.util.Scanner;

public class Quadratic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] coef = new double[3];
    for (int i = 0; i < coef.length; i++) {
      coef[i] = sc.nextDouble();
    }

    double delta = Quadratic.discriminant(coef[0], coef[1], coef[2]);
    if (delta < 0) {
      System.out.println("The quadratic equation has no solution");
    } else if (delta == 0) {
      double sol = -coef[1] / (2 * coef[0]);
      System.out.println("The quadratic equation has one repeated solution: " + sol);
    } else {
      double sol1 = (-coef[1] + Math.sqrt(delta)) / (2 * coef[0]);
      double sol2 = (-coef[1] - Math.sqrt(delta)) / (2 * coef[0]);
      System.out.printf("The quadratic equation has two solutions: %.3f and %.3f\n", sol1, sol2);
    }
  }

  public static double discriminant(double a, double b, double c) {
    return b * b - 4 * a * c;
  }
}