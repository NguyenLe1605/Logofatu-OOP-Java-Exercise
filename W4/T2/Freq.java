import java.util.*;
import java.util.Scanner;

public class Freq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sample = input.nextLine().split(" ");
        input.close();
        Map<String, Integer> letterMap = new HashMap<String, Integer>();

        // Initialize frequency table from command line
        for (String letter : sample) {
            Integer freq = letterMap.get(letter);
            letterMap.put(letter, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(letterMap.size() + " distinct words:");
        System.out.println(letterMap);
    }
}