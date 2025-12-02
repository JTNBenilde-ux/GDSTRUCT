import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardsStack deck = new CardsStack();
        CardsStack hand = new CardsStack();
        CardsStack discarded = new CardsStack();

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 30; i++) {
            deck.push(new Cards("Card " + ((i % 10) + 1)));

        }

        System.out.println("=== CARD DECK GAME START ===\n");

        int round = 1;

        while (!deck.isEmpty()) {

            System.out.println("----- ROUND " + round + " -----");
            int command = rand.nextInt(3);
            int count = rand.nextInt(5) + 1;

            switch (command) {

                case 0:
                    System.out.println("Command: DRAW " + count + " cards");
                    for (int i = 0; i < count; i++) {
                        if (deck.isEmpty()) break;
                        hand.push(deck.pop());
                    }
                    break;

                case 1:
                    System.out.println("Command: DISCARD " + count + " cards");
                    for (int i = 0; i < count; i++) {
                        Cards topCard = hand.pop();
                        if (topCard != null) discarded.push(topCard);
                        else break;
                    }
                    break;

                case 2:
                    System.out.println("Command: GET " + count + " cards from discarded pile");
                    for (int i = 0; i < count; i++) {
                        Cards topCard = discarded.pop();
                        if (topCard != null) hand.push(topCard);
                        else break;
                    }
                    break;
            }

            System.out.println("\nCards in Hand:");
            hand.printCards();

            System.out.println("\nRemaining Cards in Deck: " + deck.size());
            System.out.println("Cards in Discard Pile: " + discarded.size());

            System.out.println();
            System.out.print("Press ENTER for next round...");
            input.nextLine();

            round++;
            System.out.println();
        }

        System.out.println("=== GAME OVER ===");
        System.out.println("The player deck is empty.");
    }
}

