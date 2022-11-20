import java.util.*;
import java.util.Scanner;

public class FindDups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sample = input.nextLine().split(" ");
        input.close();

        Set<String> unique = new TreeSet<String>();
        Set<String> duplicate = new TreeSet<String>();

        for (String letter : sample) {
            if (!unique.add(letter)) {
                duplicate.add(letter);
            }
        }
        unique.removeAll(duplicate);
        System.out.println(unique.size() + " distinct word(s): " + unique);
        System.out.println(duplicate.size() + " duplicate word(s): " + duplicate);
    }
}