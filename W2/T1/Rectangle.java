public class Rectangle {
    private int width;
    private int height;
    private Point origin;

    public Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(Point p, int num_1, int num_2) {
        origin = p;
        width = num_2;
        height = num_1;
    }

    public void moveRectangle(int num_1, int num_2) {
        origin.x = num_1;
        origin.y = num_2;
    }

    public void printRectangle() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.print("Central point: ");
        origin.printPoint();
    }

    public int area_calc() {
        return height * width;
    }
}
