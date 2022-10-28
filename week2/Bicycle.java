public class Bicycle {

    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int start_cadence, int start_speed, int start_gear) {
        gear = start_cadence;
        cadence = start_speed;
        speed = start_gear;
    }

    public void print_bike() {
        System.out.println("Current cadence: " + cadence);
        System.out.println("Current gear: " + gear);
        System.out.println("Current speed: " + speed);
    }

    public void set_cadence(int number) {
        cadence = number;
    }

    public void set_gear(int number) {
        gear = number;
    }

    public void apply_brake(int number) {
        speed -= number;
    }

    public void speed_up(int number) {
        speed += number;
    }

}