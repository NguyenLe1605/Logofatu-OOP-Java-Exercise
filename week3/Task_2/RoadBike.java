public class RoadBike implements Bicycle_interface, Cloneable {
    private int seat_height;
    private int cadence;
    private int speed;
    private int gear;
    private int tireWidth;

    public RoadBike(int start_cadence, int start_speed, int start_gear, int start_height, int width) {
        this.seat_height = start_height;
        this.cadence = start_cadence;
        this.speed = start_speed;
        this.gear = start_gear;
        this.tireWidth = width;
    }

    public void set_height(int numberToSet) {
        seat_height = numberToSet;
    }

    public void set_cadence(int numberToSet) {
        cadence = numberToSet;
    }

    public void set_gear(int numberToSet) {
        gear = numberToSet;
    }

    public void apply_brake(int numberToSet) {
        speed -= numberToSet;
    }

    public void speed_up(int numberToSet) {
        speed += numberToSet;
    }

    public void set_tire_width(int numberToSet) {
        this.tireWidth = numberToSet;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void print_bike() {
        System.out.println("This is a mountain bike");
        System.out.println("Current cadence: " + this.cadence);
        System.out.println("Current speed: " + this.speed);
        System.out.println("Current width of the tires: " + this.tireWidth);
        System.out.println("Current seat height: " + this.seat_height);
        System.out.println("Current gear: " + this.gear);
    }
}
