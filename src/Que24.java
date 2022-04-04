package src;

// N-Queens Problem

public class Que24 {
    static int N = 5;
    static boolean[][] board = new boolean[N][N];
    public static void main(String[] args) {
        nQueens(board, 0);
    }
    
    public static void displayBoard(boolean[][] board) {
        for (boolean[] bs : board) {
            for (boolean b : bs) {
                if (b) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    
    public static boolean isSafe(boolean[][] board, int row, int col) {
        // Checking vertically
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Checking left diagonal
        int i = row, j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j]) {
                return false;
            }
            i--;
            j--;
        }

        // Checking right diagonal
        i = row;
        j = col;
        while (i >= 0 && j < board.length) {
            if (board[i][j]) {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }
    
    public static void nQueens(boolean[][] board, int row) {
        if (row == board.length) {
            displayBoard(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true; // Placing the queen at correct position
                nQueens(board, row + 1);
                board[row][col] = false; // backtracking step
            }
        }
    }

}
