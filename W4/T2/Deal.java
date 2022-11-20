import java.util.*;
import java.util.Scanner;

public class Deal {
  public static <E> List<E> dealHand(List<E> deck, int n) {
    int deckSize = deck.size();
    List<E> handView = deck.subList(deckSize - n, deckSize);
    List<E> hand = new ArrayList<E>(handView);
    handView.clear();
    return hand;
  }

  public static void main(String[] args) {
    // Input from users
    Scanner input = new Scanner(System.in);

    System.out.print("Type in number of hands: ");
    int numHands = input.nextInt();
    System.out.println();

    System.out.print("Type in number of cards per hand: ");
    int cardsPerHand = input.nextInt();
    System.out.println();

    input.close();

    // Make a normal 52-card deck.
    String[] suit = new String[] { "spades", "hearts", "diamonds", "clubs" };
    String[] rank = new String[] {
        "ace", "2", "3", "4", "5", "6", "7", "8",
        "9", "10", "jack", "queen", "king" };
    List<String> deck = new ArrayList<String>();
    for (int i = 0; i < suit.length; i++)
      for (int j = 0; j < rank.length; j++)
        deck.add(rank[j] + " of " + suit[i]);

    // Shuffle the deck.
    Collections.shuffle(deck);

    if (numHands * cardsPerHand > deck.size()) {
      System.out.println("Not enough cards.");
      return;
    }

    for (int i = 0; i < numHands; i++)
      System.out.println(dealHand(deck, cardsPerHand));
  }
}