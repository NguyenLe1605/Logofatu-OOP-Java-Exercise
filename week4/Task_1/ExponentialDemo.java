public class ExponentialDemo {
    public static void main(String[] args) {
        double a = 214.56;
        double b = 75.22;

        System.out.printf("Natural logarithm: %.4f%n", Math.E);

        System.out.printf("Logarithm of %.4f: %.4f%n", a, Math.log(a));

        System.out.printf("Base of natural logarithm to the power of %.4f: %.4f%n", b, Math.exp(b));

        System.out.println("2-powered value of " + b + ": " + Math.pow(b, 2));

        System.out.printf("Square-root of: %.4f: %.4f%n", a, Math.sqrt(a));
    }
}
