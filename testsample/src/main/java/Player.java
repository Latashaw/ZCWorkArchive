/**
 * Created by latashawatson on 3/8/17.
 */
public class Player {
    private int playerID;
    private int numberOfCapturedPieces = 0;
    private int[] playerPossibleMoveSpaceIndex;

    public Player() {
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getNumberOfCapturedPieces() {
        return numberOfCapturedPieces;
    }

    public void setNumberOfCapturedPieces(int numberOfCapturedPieces) {
        this.numberOfCapturedPieces = numberOfCapturedPieces;
    }

    public int[] getPlayerPossibleMoveSpaceIndex() {
        return playerPossibleMoveSpaceIndex;
    }

    public void setPlayerPossibleMoveSpaceIndex(int[] playerPossibleMoveSpaceIndex) {
        this.playerPossibleMoveSpaceIndex = playerPossibleMoveSpaceIndex;
    }

    public int[] calculateOnePiecesPossibleMoves(int pieceIndex, String spaceState, Space[] gameBoardSpaces) {
        switch (spaceState) {
            case "BLACKPIECE":
                break;
            case "BLACKKING":
                break;
            case "REDPIECE":
                break;
            case "REDKING":
                break;
            default:
                break;
        }
        return null; //need to finish
    }

    public boolean checkSpaceEmpty(int pieceIndex, Space[] gameBoardSpaces) {
        boolean isSpaceEmpty;
        Space targetSpace = gameBoardSpaces[pieceIndex];
        if (targetSpace.getState().equals("EMPTY")) {
            isSpaceEmpty = true;
        } else {
            isSpaceEmpty = false;
        }
        return isSpaceEmpty;
    }

}
