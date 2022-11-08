public class Main {
    public static void main(String[] args) {
        Bicycle bike_1 = new Bicycle(75, 25, 4);
        System.out.println("Info about bike 1: ");
        bike_1.print_bike();

        System.out.println("\nSet cadence to 84 and gear to 6");
        bike_1.set_cadence(84);
        bike_1.set_gear(6);
        bike_1.print_bike();

        Bicycle bike_2 = new Bicycle(63, 15, 2);
        System.out.println("\nInfo about bike 2: ");
        bike_2.print_bike();

        System.out.println("\nSet speed up");
        bike_1.speed_up(10);
        bike_1.print_bike();

        System.out.println("\nSet speed down");
        bike_1.apply_brake(4);
        bike_1.print_bike();

        System.out.println("\nInfo about bike 3: ");
        MountainBike bike_3 = new MountainBike(85, 30, 7, 6);
        bike_3.print_mountainbike();

        System.out.println("\nSet new seat height");
        bike_3.set_height(4);
        bike_3.print_mountainbike();
    }
}
