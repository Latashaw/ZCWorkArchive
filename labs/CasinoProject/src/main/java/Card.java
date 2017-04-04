import java.io.*;

/**
 * Created by latashawatson on 1/28/17.
 */
public class Card {

    private String suit;
    private int rank;
     int value;

    public Card(String suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }



}
