public class FaceCard extends Card{
    private int value;
    private final String JACK = "Jack";
    private final String QUEEN = "Queen";
    private final String KING = "King";
    private final String INVALID = "INVALID";
    private Suits suits;

    public FaceCard(int value, Suits suits){
        this.value = value;
        this.suits = suits;
    }

    @Override
    public String getValue() {
        if (value == 11) {
            return JACK;
        } else if (value == 12) {
            return QUEEN;
        } else if (value == 13) {
            return KING;
        } else{
            return INVALID;
        }
    }

    @Override
    public Suits getSuit() {
        return suits;
    }

    @Override
    public String toString() {
        return "FaceCard: " + getValue() + " Suit: " + getSuit();
    }


}
