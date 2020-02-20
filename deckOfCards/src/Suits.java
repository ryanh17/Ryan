public enum Suits {
    HEARTS("Hearts", "Red"),
    SPADES("Spades", "Black"),
    CLUBS("CLUBS", "Black"),
    DIAMONDS("Diamonds", "Red");

    private final String suit;
    private final String color;

    Suits(String suit, String color){
        this.suit = suit;
        this.color = color;
    }
}
