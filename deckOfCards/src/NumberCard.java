public class NumberCard extends Card{
    private String value;
    private Suits suits;

    public NumberCard(int value, Suits suits){
        this.value = Integer.toString(value);
        this.suits = suits;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public Suits getSuit() {
        return suits;
    }
}
