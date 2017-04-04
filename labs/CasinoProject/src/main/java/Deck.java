
import java.util.ArrayList;
/**
 * Created by latashawatson on 1/28/17.
 */
public class Deck {
    ArrayList<Card> cards = new ArrayList<Card>();

    private String listOfSuits[] = {"SPADES", "CLUBS", "HEARTS", "DIAMONDS"};

    public Deck() {
        createDeckOfCards();
    }

    public ArrayList<Card> createDeckOfCards() {
        for (String suit : this.listOfSuits) {

        }
        return cards;
    }
    /*for(int rank = 1; rank < 14; rank++) {
        Card c = new Card( suit, rank);
        cards.add(c);
    }*/
    public ArrayList<Card> createSetOfSuits(){

    }

}

