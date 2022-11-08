public class RectanglePlus implements Relatable, Cloneable {
    public int width;
    public int height;
    public Point origin;

    public RectanglePlus() {
        origin = new Point(0, 0);
    }

    public RectanglePlus(Point p) {
        origin = p;
    }

    public RectanglePlus(Point p, int num_1, int num_2) {
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

    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus) other;
        if (this.area_calc() < otherRect.area_calc()) {
            return -1;
        }
        if (this.area_calc() > otherRect.area_calc()) {
            return 1;
        } else {
            return 0;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(RectanglePlus other) {
        return (height * width) == other.area_calc();
    }
}
