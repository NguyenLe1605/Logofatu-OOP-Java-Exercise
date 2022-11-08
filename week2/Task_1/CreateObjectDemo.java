public class CreateObjectDemo {
    public static void main(String[] args) {
        Point point_1 = new Point(3, 5);
        Point point_2 = new Point(8, 4);

        Rectangle rec_1 = new Rectangle();
        System.out.println("First rectangle: ");
        rec_1.printRectangle();
        System.out.println("Area: " + rec_1.area_calc());

        Rectangle rec_2 = new Rectangle(point_1);
        System.out.println("\nSecond rectangle: ");
        rec_2.printRectangle();
        System.out.println("Area: " + rec_2.area_calc());

        Rectangle rec_3 = new Rectangle(point_2, 9, 4);
        System.out.println("\nThird rectangle: ");
        rec_3.printRectangle();
        System.out.println("Area: " + rec_3.area_calc());

        rec_3.moveRectangle(17, 8);
        System.out.println("\nThird rectangle: ");
        rec_3.printRectangle();
    }
}
