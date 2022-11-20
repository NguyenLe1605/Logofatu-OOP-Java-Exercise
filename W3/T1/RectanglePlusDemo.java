public class RectanglePlusDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point_1 = new Point(3, 5);
        Point point_2 = new Point(8, 4);

        RectanglePlus rec_1 = new RectanglePlus();
        System.out.println("First RectanglePlus: ");
        rec_1.printRectangle();
        System.out.println("Area: " + rec_1.area_calc());

        RectanglePlus rec_2 = new RectanglePlus(point_1, 12, 5);
        System.out.println("\nSecond RectanglePlus: ");
        rec_2.printRectangle();
        System.out.println("Area: " + rec_2.area_calc());

        RectanglePlus rec_3 = new RectanglePlus(point_2, 9, 4);
        System.out.println("\nThird RectanglePlus: ");
        rec_3.printRectangle();
        System.out.println("Area: " + rec_3.area_calc());

        rec_3.moveRectangle(17, 8);
        System.out.println("\nThird RectanglePlus: ");
        rec_3.printRectangle();

        System.out.println("\nRec 3 is larger than Rec 2? " + rec_3.isLargerThan(rec_2));

        RectanglePlus rec_4 = (RectanglePlus) rec_3.clone();
        rec_4.printRectangle();
        System.out.println("\nRec 4 is equal Rec 3? " + rec_4.equals(rec_3));
        System.out.println("\nClass type of object rec_3: " + rec_3.getClass().getSimpleName());
        System.out.println("\nHash code of rec_3: " + rec_3.hashCode());
        System.out.println("\nString representation of rec_3: " + rec_3.toString());
    }
}
