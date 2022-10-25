public class RandomSeqAB {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Usage: RandomSeqAB A B N");
      System.exit(0);
    }
    int A = Integer.parseInt(args[0]);
    int B = Integer.parseInt(args[1]);
    int N = Integer.parseInt(args[2]);
    for (int i = 0; i < N; i++) {
      long randVal = Math.round(Math.random() * (B - A) + A);
      System.out.print(randVal +  " ");
    }
    System.out.println();
  }
}