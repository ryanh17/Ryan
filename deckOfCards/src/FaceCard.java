public class FaceCard extends Card{
    private String value;
    private Suits suits;

    public FaceCard(String value, Suits suits){
        this.value = value;
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
