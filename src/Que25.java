package src;

// N-Knights problem (Place 'N' knights in N*N board)

public class Que25 {
    static int N = 4;
    static boolean[][] board = new boolean[N][N];
    public static void main(String[] args) {
        nKnights(board, 0, 0, 4);
    }

    public static void displayBoard(boolean[][] board) {
        for (boolean[] bs : board) {
            for (boolean b : bs) {
                if (b) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isValid(boolean[][] board, int row, int col) {
        if ((row >= 0 && row < board.length) && (col >= 0 && col < board.length)) {
            return true;
        }
        return false;
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // We have to check if knight that we're goig to place will hit 
        // already placed knight or not, so there are four conditions
        // (row - 2, col - 1), (row - 2, col + 1), (row - 1, col - 2), (row - 1, col + 2)

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }
    
    public static void nKnights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            displayBoard(board);
            System.out.println();
            return;
        }

        // Reached at the end of board then return
        if (row == board.length - 1 && col == board.length) {
            return;
        }

        // If reached at the end of col, increment row
        if (col == board.length) {
            nKnights(board, row + 1, 0, knights);
            return;
        }

        // If isSafe then place the knight
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        // If nothing happens then check for next col in same row
        nKnights(board, row, col + 1, knights);
    }

}
