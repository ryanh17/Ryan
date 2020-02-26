public class NumberCard extends Card{
    private int value;
    private final String ACE = "Ace";
    private Suits suits;

    public NumberCard(int value, Suits suits){
        this.value = value;
        this.suits = suits;
    }

    @Override
    public String getValue() {
        if (value == 1){
            return ACE;
        }else{
            return Integer.toString(value);
        }
    }

    @Override
    public Suits getSuit() {
        return suits;
    }

    @Override
    public String toString() {
        return "NumberCard: " + getValue() + " Suit: " + getSuit();
    }
}
