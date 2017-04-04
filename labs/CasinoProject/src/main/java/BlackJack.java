import java.util.*;

/**
 * Created by latashawatson on 1/28/17.
 */
public class BlackJack extends CasinoCardGames {
    GuestPlayer player = new GuestPlayer();
    HousePlayer dealer = new HousePlayer();
    String userStringInput;
    double userDoubleInput;
    int cardValue = 0;
    int dealerTotal = 0;
    int playerTotal = 0;
    int playerTotalRank;
    int dealerTotalRank;

    public void runBlackJack() {
        Display.println("--$----------$----------$-------------------------------------------$$$$$\n--$----------$----------$---------------------------------------------$$$\n--$----------$----------$----------------------------------------------$$\n--$----------$---$$$$$--$------$$$$$--$$$$$--$$$----$$$-----$$$$$------$$\n--$----------$---$------$------$------$---$--$$$$---$$$$----$----------$$\n--$----------$---$------$------$------$---$--$--$$--$---$---$----------$$\n--$----------$---$------$------$------$---$--$---$$-$---$---$----------$$\n--$---$------$---$$$----$------$------$---$--$----$$$---$---$$$--------$$\n--$---$$-----$---$------$------$------$---$--$-----$$---$---$----------$$\n--$---$-$----$---$------$------$------$---$--$----------$---$------------\n--$$$$$--$$$$$---$------$------$------$---$--$----------$---$------------\n----$$$----$$$---$$$----$$$----$$$----$---$--$----------$---$$$--------$$\n-----$------$----$$$$$--$$$$$--$$$$$--$$$$$--$----------$---$$$$$------$$\n");
        this.userDoubleInput =
                Display.getDoubleInput("Would you like to place a bet? If so how much?");
        placeBet(this.userDoubleInput);
        dealer.shuffle();
        dealer.deal(player, 2);
        dealer.deal(dealer, 2);
        player.checkHand();
        findDealerTotalRankBeforeAssigningCardBlackJackValues();
        findPlayerTotalRankBeforeAssigningCardBlackJackValues();
        findPlayerTotalRank();
        findDealerTotalRank();
        hitOrStay();

    }

    public void setPlayer(GuestPlayer guest) {
        player = guest;

    }


    public boolean checkForPlayerWin() {
        if (playerTotal == 21) {
            return true;
        } else if (checkPlayerBust()) {
            return false;
        } else if (checkDealerBust()) {
            return true;
        } else if (stayResults()) {
            return true;
        } else if (playerTotal == dealerTotal) {
            System.out.println("YOU TIED!");
        }
        return false;
    }

    public boolean stayResults1() {
        if (dealerTotal == 21) {
            return false;
        } else return true;
    }

    public boolean stayResults2() {
        if (playerTotal > dealerTotal) {
            return true;
        } else return false;
    }

    public void endGameOptions() {
        this.userStringInput =
                Display.getStringInput("Would you like to 'play again', 'casino main menu' or 'exit casino'?");
        switch (this.userStringInput.toLowerCase()) {
            case "play again":
                runBlackJack();
                break;
            case "casino main menu":
                Casino myCasino = new Casino();
                myCasino.openCasino();
                break;
            case "exit casino":
                System.exit(0);
        }
    }

    public void hitOrStay() {
        this.userStringInput =
                Display.getStringInput("Would you like to 'stay' or 'hit'?");
        switch (this.userStringInput.toLowerCase()) {
            case "stay":
                displayResults();
                endGameOptions();
                break;
            case "hit":
                dealer.deal(player, 1);
                player.checkHand();
                if (checkPlayerBust()) {
                    displayResults();
                    endGameOptions();
                    break;
                } else {
                    hitOrStay();
                    break;
                }
            default:
                System.out.println("Invalid Entry");
                hitOrStay();
                break;
        }
    }


    public boolean checkPlayerBust() {
        if (playerTotal > 21) {
            return true;
        } else return false;
    }

    public boolean checkDealerBust() {
        if (dealerTotal > 21) {
            return true;
        } else return false;
    }

    public int findPlayerTotalRank() {
        for (Card card : player.hand) {
            playerTotal += getPlayerCardValue(card);
        }
        return playerTotal;
    }

    public int findDealerTotalRank() {
        for (Card card : dealer.hand) {
            dealerTotal += getDealerCardValue(card);
        }
        return dealerTotal;
    }

    public int findDealerTotalRankBeforeAssigningCardBlackJackValues() {
        for (Card card : dealer.hand) {
            dealerTotalRank += card.getRank();
        }
        return dealerTotalRank;
    }

    public int findPlayerTotalRankBeforeAssigningCardBlackJackValues() {
        for (Card card : dealer.hand) {
            playerTotalRank += card.getRank();
        }
        return playerTotalRank;
    }

    public int getDealerCardValue(Card card) {
        if (card.getRank() >= 10) {
            cardValue = 10;
        }
        else if (card.getRank() == 1) {
            if (dealerTotalRank <= 11) {
                cardValue = 11;
            } else {
                cardValue = 1;
            }
        } else {
            cardValue = card.getRank();
        }
        return cardValue;
    }


}



