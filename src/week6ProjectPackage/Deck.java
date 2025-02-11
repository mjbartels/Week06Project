package week6ProjectPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    // Constructor to populate the deck with standard 52 cards
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (int i = 0; i < names.length; i++) {
                cards.add(new Card(i + 2, names[i] + " of " + suit));
            }
        }
    }

    // Shuffle method
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draw method
    public Card draw() {
        return cards.remove(cards.size() - 1);
    }
}
