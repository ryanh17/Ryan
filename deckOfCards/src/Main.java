import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> deckOfCards = new LinkedList<>();

        for(int i = 1; i < 11; i++){
            deckOfCards.add(new NumberCard(i, Suits.CLUBS));
            deckOfCards.add(new NumberCard(i, Suits.HEARTS));
            deckOfCards.add(new NumberCard(i, Suits.DIAMONDS));
            deckOfCards.add(new NumberCard(i, Suits.SPADES));
        }
        for(int i = 11; i < 14; i++){
            deckOfCards.add(new FaceCard(i, Suits.CLUBS));
            deckOfCards.add(new FaceCard(i, Suits.SPADES));
            deckOfCards.add(new FaceCard(i, Suits.HEARTS));
            deckOfCards.add(new FaceCard(i, Suits.DIAMONDS));
        }

        for(Card c : deckOfCards){
            System.out.println(c.toString());
        }

        System.out.println("-------------SORTED- by card value------------------------------");

        Collections.sort(deckOfCards);
        Iterator<Card> cardIterator = deckOfCards.listIterator();
        while(cardIterator.hasNext()){
            System.out.println(cardIterator.next());
        }

        System.out.println("-------------SORTED- by greatest suit------------------------------");
        CardComparator cardComparator = new CardComparator();
        Collections.sort(deckOfCards, cardComparator);
        Iterator<Card> cardIterator1 = deckOfCards.listIterator();
        while(cardIterator1.hasNext()){
            System.out.println(cardIterator1.next());
        }

    }
}
