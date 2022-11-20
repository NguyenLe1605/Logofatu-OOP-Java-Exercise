public class BasicMathDemo {
    public static void main(String[] args) {
        double a = -21312.244;
        double b = 3512.425;
        int c = 321;
        int d = -950;

        System.out.println("Absolute value of " + a + ": " + Math.abs(a));

        System.out.println("Round value " + b + " to larger integer: " + Math.ceil(b));
        System.out.println("Round value " + b + " to smaller integer: " + Math.floor(b));
        System.out.println("Return closest integer to the value of " + b + ": " + Math.rint(b));

        System.out.println(c + " <> " + d + ": Min value is " + Math.min(c, d));
        System.out.println(c + " <> " + d + ": Max value is " + Math.max(c, d));
    }
}
