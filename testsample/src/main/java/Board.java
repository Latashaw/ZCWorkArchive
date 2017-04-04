/**
 * Created by latashawatson on 3/8/17.
 */
public class Board {

    //This board object will be passed so that front end can get clickedSpaceIndex & possibleMoveSpaces easily; and so that front end gets board layout
    private int[] playerPossibleMoveSpaceIndex;
    private int clickedSpaceIndex;
    private Space[] gameBoardSpaces = new Space[32];
    private boolean isComputerTurn;

    public void createBoard() {
        for (int i = 0; i < 11; i++) {
            gameBoardSpaces[i] = new Space("BLACKPIECE");
        }
        for (int i = 12; i < 19; i++) {
            gameBoardSpaces[i] = new Space("EMPTY");
        }

        for (int i = 20; i < 31; i++) {
            gameBoardSpaces[i] = new Space("REDPIECE");
        }
    }

    public boolean isComputerTurn() {
        return isComputerTurn;
    }

    public void setComputerTurn(boolean computerTurn) {
        isComputerTurn = computerTurn;
    }

    //Used to get possibleMoveSpaces from backend to front end
    public int[] getPossibleMoveSpaces() {
        return playerPossibleMoveSpaceIndex;
    }

    public void setPossibleMoveSpaces(int[] possibleMoveSpaces) {
        this.playerPossibleMoveSpaceIndex = possibleMoveSpaces;
    }

    public int getClickedSpaceIndex() {
        return clickedSpaceIndex;
    }

    //For front end to use in order to set the Guest player clickedSpaceIndex piece for back end
    public void setClickedSpaceIndex(int clickedSpaceIndex) {
        this.clickedSpaceIndex = clickedSpaceIndex;
    }

    //Used to retrieve gameBoardSpaces from backend to front end
    public Space[] getGameBoardSpaces() {
        return gameBoardSpaces;
    }

    //This method could set the gameBoardSpaces to the "updated" version that reflects front end changes
    public void setGameBoardSpaces(Space[] gameBoardSpaces) {
        this.gameBoardSpaces = gameBoardSpaces;
    }
}
