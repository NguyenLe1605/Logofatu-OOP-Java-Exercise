import java.util.Scanner;

public class RandomSeq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        while (n > 0) {
            System.out.print(Math.random() + " ");
            n--;
        }
    }
}
