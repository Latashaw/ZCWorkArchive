import java.util.*;

/**
 * Created by latashawatson on 1/28/17.
 */
public class Player {

    protected ArrayList<Card> hand = new ArrayList<Card>();

    public void checkHand() {
        for (Card cardsInHand : this.hand) {
            System.out.println(cardsInHand.getRank() + " " + cardsInHand.getSuit() + " ");
        }
    }

    public void getCardFromOtherHand(Player givingPlayer, Player receivingPlayer, Card rank) {
        for (int i = 0; i < givingPlayer.hand.size(); i++) {
            if (givingPlayer.hand.get(i) == rank) {
                receivingPlayer.hand.add(givingPlayer.hand.get(i));
                givingPlayer.hand.remove(givingPlayer.hand.get(i));
            }
        }
    }
}