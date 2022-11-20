public class ValueOfDemo {
    public static void main(String[] args) {
        float a = (Float.valueOf(args[0])).floatValue();
        float b = (Float.valueOf(args[1])).floatValue();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}
