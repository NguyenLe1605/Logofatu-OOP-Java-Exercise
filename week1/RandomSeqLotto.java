import java.util.*;

public class RandomSeqLotto {
    public static void main(String[] args) {
        int A = 1;
        int B = 49;
        int n = 6;
        int range = (A - B) + 1;
        int number = 0;
        List<Integer> dupe = new ArrayList<Integer>();
        do {
            number = (int) (Math.random() * range + B);
            dupe.add(number);
            System.out.print(number + " ");
            n--;
        } while (n > 0 && !dupe.contains(number));
    }
}
