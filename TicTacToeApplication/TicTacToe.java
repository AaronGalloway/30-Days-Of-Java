package TicTacToeApplication;

public class TicTacToe {

    // Picture Of Game With Index:
    // For Storage:
    // 0 | 1 | 2
    // -----------
    // 3 | 4 | 5
    // -----------
    // 6 | 7 | 8
    // What The User Thinks
    // 1 | 2 | 3
    // -----------
    // 4 | 5 | 6
    // -----------
    // 7 | 8 | 9

    // UI Picture Of Game
    // INIT:
    // | - | - | -
    // -------------
    // | - | - | -
    // -------------
    // | - | - | -
    // GAMEPLAY:
    // | 0 | - | 0
    // ------------
    // | - | X | -
    // ------------
    // | - | - | X

    // SETTING UP THE GAME:
    // Creating the board
    protected char[] board;

    // Allowing the user to show their move
    protected char userMarker;

    // Allowing the ai to show their move
    protected char aiMarker;

    // Declaring the winner
    protected char winner;

    // Declaring the current marker
    protected char currentMarker;

    // Creating a constructor
    public TicTacToe(char playerToken, char aiMarker) {
        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMarker = userMarker;
    }

    // Creating the board
    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i=0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    // Playing turns
    public boolean playTurn(int spot) {
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker;
            // single line "if" statement
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }
        return isValid;
    }

    // Check if the spot is within range
    public boolean withinRange(int number) {
        return number > 0 && number < board.length + 1;
    }

    // Check if the spot is taken
    public boolean isSpotTaken(int number) {
        return board[number-1] != '-';
    }

    // Print out the board
    public void printBoard() {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("----------------");
            }
            System.out.println(" | " + board[i]);
        }
        System.out.println();
    }

    public void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("----------------");
            }
            System.out.println(" | " + (i + 1));
        }
        System.out.println();       
    }

    public TicTacToe() {
    }

    // Checking to see if there are three items in a row to determine a winner
    public boolean isThereAWinner() {
        boolean diagonalsAndMiddles = (rightDi() || leftDi() || middleRow() || secondCol()) && board[4] != '-';
        boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
        boolean bottomAndThird = (bottomRow() || thirdCol()) && board[8] != '-';

        // Checking for winning combinations
        if (diagonalsAndMiddles) {
            this.winner = board[4];
        } else if (topAndFirst) {
            this.winner = board[0];
        } else if (bottomAndThird) {
            this.winner = board[8];
        }
        return diagonalsAndMiddles || topAndFirst || bottomAndThird;
    }

    public boolean topRow() {
        return board[0] == board[1] && board[1] == board[2];
    }

    public boolean middleRow() {
        return board[3] == board[4] && board[4] == board[5];
    }

    public boolean bottomRow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    public boolean firstCol() {
        return board[0] == board[3] && board[3] == board[6];
    }

    public boolean secondCol() {
       return board[1] == board[4] && board[4] == board[7]; 
    }

    public boolean thirdCol() {
        return board[2] == board[5] && board[5] == board[8];
    }

    public boolean rightDi() {
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean leftDi() {
        return board[2] == board[4] && board[4] == board[6];
    }

    public boolean isTheBoardFilled() {
        for (int i=0; i < board.length; i++) {
            if (board[i] == '-') {
                return false;
            }
        }
        return true;
    }

    public String gameOver() {
        boolean didSomeoneWin = isThereAWinner();
        if (didSomeoneWin) {
            return "We have a winner! The winner is: " + this.winner;
        } else if (isTheBoardFilled()) {
            return "Draw. Game Over.";
        } else {
            return "notOver";
        }
    }
}
