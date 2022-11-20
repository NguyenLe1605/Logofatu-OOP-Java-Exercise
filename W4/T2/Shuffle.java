import java.util.*;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = Arrays.asList(input.nextLine().split(" "));
        input.close();
        Collections.shuffle(list);
        System.out.println(list);
    }
}