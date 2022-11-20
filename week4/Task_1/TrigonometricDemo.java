public class TrigonometricDemo {
    public static void main(String[] args) {
        double degree = 60.0;
        double radian = Math.toRadians(degree);
        double x = 4.5;
        double y = 7.8;

        System.out.printf("Sine of %.2f degree is %.4f%n", degree, Math.sin(radian));

        System.out.printf("Cosine of %.2f degree is %.4f%n", degree, Math.cos(radian));

        System.out.printf("Tangent of %.2f degree is %.4f%n", degree, Math.tan(radian));

        System.out.printf("Arcsine of %.2f is %.4f degree%n", Math.sin(radian),
                Math.toDegrees(Math.asin(Math.sin(radian))));

        System.out.printf("Arccosine of %.2f is %.4f degree%n", Math.cos(radian),
                Math.toDegrees(Math.acos(Math.cos(radian))));

        System.out.printf("Arctangent of %.2f is %.4f degree%n", Math.tan(radian),
                Math.toDegrees(Math.atan(Math.tan(radian))));

        System.out.printf("Convert (%.2f, %.2f) to polar coordinate and return theta: %.4f%n",
                x, y, Math.atan2(x, y));
    }
}
