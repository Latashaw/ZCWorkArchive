import java.util.*;
/**
 * Created by latashawatson on 1/28/17.
 */
public abstract class CasinoCardGames {
   GuestPlayer player = new GuestPlayer();
   HousePlayer dealer = new HousePlayer();
    public double userDoubleInput;
    public double betAmount;

    public abstract boolean checkForPlayerWin();

    public void placeBet(double betAmount) {
        if (betAmount <= player.getBalance()) {
            this.betAmount = betAmount;
        } else {
            Display.println("Your account does not have enough for that bet amount.");
            Display.println("Your balance is" + player.getBalance());
            this.userDoubleInput =
                    Display.getDoubleInput("Please enter a valid amount.");
            placeBet(userDoubleInput);
        }
    }

    public double tallyBet() {
        if (checkForPlayerWin()) {
            player.setBalance(betAmount);
            return player.getBalance();
        } else {
            betAmount = -betAmount;
            player.setBalance(betAmount);
            return player.getBalance();
        }
    }

    public void displayResults() {
        if (checkForPlayerWin()) {
            Display.println(" YOU WON!" + '\n' + "Your current balance is:" + tallyBet());
        } else {
            Display.println(" YOU LOST!" + '\n' + "Your current balance is:" + tallyBet());
        }
    }

}
