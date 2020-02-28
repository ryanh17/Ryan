public abstract class Card  implements Comparable<Card>{

    public Card(){

    }


    public abstract String getValue();

    public abstract Suits getSuit();

    public abstract int compareTo(Card o);

    public abstract int getNumberValue();
}
