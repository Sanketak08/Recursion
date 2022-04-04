package src;

// N-Knights Tour (Place knights in all the board positions)

public class Que26 {
    public static void main(String[] args) {
        int[][] board = new int[5][5];
        printKnightstour(board, 2, 3, 1);
    }
    
    public static void printKnightstour(int[][] board, int row, int col, int move) {
        if (row < 0 || col < 0 || row >= board.length || col >= board.length || board[row][col] > 0) {
            return;
        } else if (move == board.length * board.length) {
            board[row][col] = move;
            displayBoard(board);
            board[row][col] = 0;
            return;
        }
        System.out.println("YES");

        board[row][col] = move;

        // Calls for placing knight at all possible positions
        printKnightstour(board, row - 2, col + 1, move + 1);
        printKnightstour(board, row - 1, col + 2, move + 1);
        printKnightstour(board, row + 1, col + 2, move + 1);
        printKnightstour(board, row + 2, col + 1, move + 1);
        printKnightstour(board, row + 2, col - 1, move + 1);
        printKnightstour(board, row + 1, col - 2, move + 1);
        printKnightstour(board, row - 1, col - 2, move + 1);
        printKnightstour(board, row - 2, col - 1, move + 1);

        board[row][col] = 0; // Backtracking step
    }

    public static void displayBoard(int[][] board) {
        for (int[] bs : board) {
            for (int b : bs) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
