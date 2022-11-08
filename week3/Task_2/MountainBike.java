public class MountainBike implements Bicycle_interface, Cloneable {
    private int seat_height;
    private int cadence;
    private int speed;
    private int gear;
    private String suspension;

    public MountainBike(int start_cadence, int start_speed, int start_gear, int start_height, String start_suspension) {
        this.seat_height = start_height;
        this.cadence = start_cadence;
        this.speed = start_speed;
        this.gear = start_gear;
        this.suspension = start_suspension;
    }

    public void set_height(int numberToSet) {
        this.seat_height = numberToSet;
    }

    public void set_cadence(int numberToSet) {
        this.cadence = numberToSet;
    }

    public void set_gear(int numberToSet) {
        this.gear = numberToSet;
    }

    public void apply_brake(int numberToSet) {
        this.speed -= numberToSet;
    }

    public void speed_up(int numberToSet) {
        this.speed += numberToSet;
    }

    public void set_suspension(String type) {
        this.suspension = type;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void print_bike() {
        System.out.println("This is a mountain bike");
        System.out.println("Current cadence: " + this.cadence);
        System.out.println("Current speed: " + this.speed);
        System.out.println("Suspension status: " + this.suspension);
        System.out.println("Current seat height: " + this.seat_height);
        System.out.println("Current gear: " + this.gear);
    }
}
