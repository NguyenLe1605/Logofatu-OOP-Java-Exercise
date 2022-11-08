public class TestSimpleTimeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        SimpleTimeClient myTimeClient = new SimpleTimeClient();
        System.out.println("Current time: " + myTimeClient.getLocalDateTime());

        myTimeClient.setTime(5, 32, 15);
        System.out.println("\nCurrent time: " + myTimeClient.getLocalDateTime());

        myTimeClient.setDate(17, 9, 2032);
        System.out.println("\nCurrent time: " + myTimeClient.getLocalDateTime());

        myTimeClient.setDateAndTime(25, 10, 2029, 10, 48, 40);
        System.out.println("\nCurrent time: " + myTimeClient.getLocalDateTime());

        Object obj = myTimeClient.clone();
        if (obj instanceof TimeClient) {
            TimeClient myTimeClient_2 = (TimeClient) obj;
            System.out.println("\nCurrent time from alternative object: " + myTimeClient_2.getLocalDateTime());
        }
        System.out.println("\nObject myTimeClient is equal to clone of object obj: " + myTimeClient.equals(obj));
        System.out.println("\nClass type of object obj: " + obj.getClass().getSimpleName());
        System.out.println("\nHash code of myTimeClient: " + myTimeClient.hashCode());
        System.out.println("\nString representation of myTimeClient: " + myTimeClient.toString());
    }
}
