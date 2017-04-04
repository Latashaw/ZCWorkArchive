import java.util.*;

/**
 * Created by latashawatson on 1/28/17.
 */
public class Casino {

    GuestPlayer player;
    //GoFish goFish = new GoFish();
    BlackJack blackJack = new BlackJack();
    double userDoubleInput;
    String userStringInput;


    public void openCasino() {
        player = new GuestPlayer();
        Display.println("--$----------$----------$-------------------------------------------$$$$$\n--$----------$----------$---------------------------------------------$$$\n--$----------$----------$----------------------------------------------$$\n--$----------$---$$$$$--$------$$$$$--$$$$$--$$$----$$$-----$$$$$------$$\n--$----------$---$------$------$------$---$--$$$$---$$$$----$----------$$\n--$----------$---$------$------$------$---$--$--$$--$---$---$----------$$\n--$----------$---$------$------$------$---$--$---$$-$---$---$----------$$\n--$---$------$---$$$----$------$------$---$--$----$$$---$---$$$--------$$\n--$---$$-----$---$------$------$------$---$--$-----$$---$---$----------$$\n--$---$-$----$---$------$------$------$---$--$----------$---$------------\n--$$$$$--$$$$$---$------$------$------$---$--$----------$---$------------\n----$$$----$$$---$$$----$$$----$$$----$---$--$----------$---$$$--------$$\n-----$------$----$$$$$--$$$$$--$$$$$--$$$$$--$----------$---$$$$$------$$\n");
        String name = Display.getStringInput("What is your name?");
        player.setName(name);
        Display.println("Your balance is " + " " + player.getBalance());
        addToBalance();
        gameMenu();
    }

    public void addToBalance(){
        this.userStringInput = Display.getStringInput("Would you like to add to your balance? [ yes ] or [ no ]");
        switch (userStringInput.toLowerCase()) {
            case "yes":
                this.userDoubleInput =
                    Display.getDoubleInput("How much would you like to add?");
                player.setBalance(userDoubleInput);
                System.out.println("Your new balance is " + player.getBalance());
                break;
            case "no":
                break;
            default:
                System.out.println("Invalid Entry");
                this.userStringInput = Display.getStringInput("Would you like to add to your balance? [ yes ] or [ no ]");
                addToBalance();
                break;
        }

    }

    public void gameMenu() {
        this.userStringInput = Display.getStringInput("Would you like to play [ blackjack ] or [ gofish ] ?");
        switch (this.userStringInput.toLowerCase()) {
            case "blackjack":
                blackJack.setPlayer(player);
                blackJack.runBlackJack();
                break;
            case "gofish":
                //goFish.runGoFish();
                break;
            default:
                System.out.println("Invalid Entry");
                this.userStringInput =
                        Display.getStringInput("Would you like to play [ blackjack ] or [ gofish ] ?");
                gameMenu();
                break;
        }

    }
}











