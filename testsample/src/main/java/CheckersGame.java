/**
 * Created by latashawatson on 3/8/17.
 */
public class CheckersGame {
    private Board gameBoard;
    private Player player;
    private Computer computerPlayer;

//Players decide what move to make, game makes move
    public CheckersGame() {
        gameBoard = new Board();
        player = new Player();
        computerPlayer = new Computer();
    }

    public void runCheckersGame() {
    }

    public void updateGameBoardState() {}

    public void divideGameBoardToEachPlayerPieces() {}

    public void countPiecesCatured() {}

    public void initiateKinging() {}

    public void checkForGameEnd() {}

    public void displayWinner() {}
}
