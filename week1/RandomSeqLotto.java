import java.util.*;

public class RandomSeqLotto {
  public static void main(String[] args) {

    Set<Long> checkSet = new HashSet<>();
    for (int i = 0; i < 6; i++) {
      long randVal;
      do {     
        randVal = Math.round(Math.random() * (49 - 1) + 1);
        checkSet.add(randVal);
        System.out.print(randVal + " ");
      } while (!checkSet.contains(randVal));
      
    }
    System.out.println();
  }
}