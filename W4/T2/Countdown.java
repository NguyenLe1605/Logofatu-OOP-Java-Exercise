import java.util.*;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int timeLeft = input.nextInt();
        input.close();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = timeLeft; i >= 0; i--)
            queue.add(i);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            Thread.sleep(1000);
        }
        if (queue.isEmpty()) {
            System.out.println("Time's out");
        }
    }
}