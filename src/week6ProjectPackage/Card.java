package week6ProjectPackage;

public class Card {
    private int value; // Value from 2-14 representing cards 2-Ace
    private String name; // e.g. Ace of Diamonds, or Two of Hearts

    // Constructor
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Describe method
    public void describe() {
        System.out.println(name);
    }
}
