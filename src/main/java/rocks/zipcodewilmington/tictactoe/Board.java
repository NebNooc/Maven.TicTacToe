package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    private Boolean horizontal(Character x) {
        for (int i = 0; i < 3; i++) {
            if ((board[0][i] == x) && (board[1][i] == x) && (board[2][i] == x)) {
                return true;
            }
        }
        return false;
    }

    private Boolean vertical(Character x) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == x) && (board[i][1] == x) && (board[i][2] == x)) {
                return true;
            }
        }
        return false;
    }

    private Boolean diagonal(Character x) {
        if ((board[0][0] == x) && (board[1][1] == x) && (board[2][2] == x)){
            return true;
        } else if ((board[2][0] == x) && (board[1][1] == x) && (board[0][2] == x)){
            return true;
        }
        return false;
    }


    public Boolean isInFavorOfX() {
        return horizontal('X') || vertical('X') || diagonal('X');
    }

    public Boolean isInFavorOfO() {
        return horizontal('O') || vertical('O') || diagonal('O');
    }

    public Boolean isTie() {
        return !(isInFavorOfX() || isInFavorOfO());
    }

    public String getWinner() {
        if(isInFavorOfX()){
            return "X";
        } else if (isInFavorOfO()){
            return "O";
        } else {
            return "";
        }
    }

}
