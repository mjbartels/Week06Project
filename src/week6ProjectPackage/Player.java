package week6ProjectPackage;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>();
    private int score = 0;
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
    }

    // Describe method
    public void describe() {
        System.out.println("Player: " + name);
        for (Card card : hand) {
            card.describe();
        }
    }

    // Flip method
    public Card flip() {
        return hand.remove(hand.size() - 1);
    }

    // Draw method
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    // IncrementScore method
    public void incrementScore() {
        score++;
    }

    // Getters
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
