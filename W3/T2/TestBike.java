public class TestBike {
    public static void main(String[] args) throws CloneNotSupportedException {
        MountainBike bike_1 = new MountainBike(75, 25, 4, 4, "Dual");
        System.out.println("Info about bike 1: ");
        bike_1.print_bike();

        System.out.println("\nSet cadence to 84 and gear to 6");
        bike_1.set_cadence(84);
        bike_1.set_gear(6);
        System.out.println("\nInfo about bike 1: ");
        bike_1.print_bike();

        RoadBike bike_2 = new RoadBike(63, 15, 21, 1, 4);
        System.out.println("\nInfo about bike 2: ");
        bike_2.print_bike();

        System.out.println("\nSet speed up");
        bike_2.speed_up(10);
        System.out.println("\nInfo about bike 2: ");
        bike_2.print_bike();

        System.out.println("\nSet speed down");
        bike_2.apply_brake(4);
        System.out.println("\nInfo about bike 2: ");
        bike_2.print_bike();

        System.out.println("\nClone bike 2 to bike 3");
        Object obj = (RoadBike) bike_2.clone();
        if (obj instanceof RoadBike) {
            RoadBike bike_3 = (RoadBike) obj;
            System.out.println("\nInfo about bike 3: ");
            bike_3.print_bike();
        }
        System.out.println("\nObject bike_2 is equal to clone of object bike_2: " + bike_2.equals(obj));
        System.out.println("\nClass type of object bike_2: " + bike_2.getClass().getSimpleName());
        System.out.println("\nHash code of bike_2: " + bike_2.hashCode());
        System.out.println("\nString representation of bike_2: " + bike_2.toString());
    }
}
