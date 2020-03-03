public enum Suits {
    HEARTS("Hearts", "Red"),
    SPADES("Spades", "Black"),
    CLUBS("Clubs", "Black"),
    DIAMONDS("Diamonds", "Red");

    private final String suit;
    private final String color;

    Suits(String suit, String color){
        this.suit = suit;
        this.color = color;
    }

    public int getSuitValue(){
        if(suit.equals("Spades")){
            return 3;
        }else if (suit.equals("Hearts")){
            return 2;
        } else if (suit.equals("Diamonds")){
            return 1;
        }else {
            return 0;
        }
    }
}
