package week6ProjectPackage;

public class App {
    public static void main(String[] args) {
        // Instantiate a Deck and two Players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Shuffle the deck
        deck.shuffle();

        // Draw cards for both players
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Flip cards and compare
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            System.out.print("Round " + (i + 1) + ": ");
            player1Card.describe();
            System.out.print(" vs ");
            player2Card.describe();

            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println(" -> Player 1 wins this round");
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
                System.out.println(" -> Player 2 wins this round");
            } else {
                System.out.println(" -> It's a tie, no points awarded");
            }

            // Print updated scores
            System.out.println("Scores: Player 1 = " + player1.getScore() + ", Player 2 = " + player2.getScore());
        }

        // Print final scores and determine winner
        System.out.println("Final Scores:");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}