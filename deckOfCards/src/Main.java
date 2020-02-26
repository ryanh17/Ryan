import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> deckOfCards = new LinkedList<Card>();
        Suits clubs = new Suits(Suits.CLUBS);
        Suits diamonds = new Suits(Suits.DIAMONDS);
        Suits hearts = new Suits(Suits.HEARTS);
        Suits spades = new Suits(Suits.SPADES);
        for(int i = 1; i < 11; i++){
            deckOfCards.add(new NumberCard(i, clubs));
            deckOfCards.add(new NumberCard(i, diamonds));
            deckOfCards.add(new NumberCard(i, hearts));
            deckOfCards.add(new NumberCard(i, spades));
        }
        for(int i = 11; i < 14; i++){
            deckOfCards.add(new FaceCard(i, clubs));
            deckOfCards.add(new FaceCard(i, diamonds));
            deckOfCards.add(new FaceCard(i, hearts));
            deckOfCards.add(new FaceCard(i, spades));
        }

    }
}
