import java.util.*;

/**
 * Created by latashawatson on 1/28/17.
 */
public class HousePlayer extends Player {
    Deck houseDeck = new Deck();

    public void deal(Player type, int numberOfCards) {
        for (int i = 0; i < numberOfCards; i++) {
            Card tempCard = houseDeck.cards.get(i);
            houseDeck.cards.remove(i);
            type.hand.add(tempCard);
        }
    }

    public void shuffle() {
        Collections.shuffle(houseDeck.cards);
    }

}
