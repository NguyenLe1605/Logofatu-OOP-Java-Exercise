import java.util.Scanner;

public class RandomSeqAB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int n = input.nextInt();
        int range = (A - B) + 1;
        input.close();
        while (n > 0) {
            System.out.print((int) (Math.random() * range + B) + " ");
            n--;
        }
    }
}
