public class MountainBike extends Bicycle {
    public int seat_height;

    public MountainBike(int start_cadence, int start_speed, int start_gear, int start_height) {
        super(start_cadence, start_speed, start_gear);
        seat_height = start_height;
    }

    public void set_height(int number) {
        seat_height = number;
    }

    public void print_mountainbike() {
        print_bike();
        System.out.println("Current seat height: " + seat_height);
    }
}
