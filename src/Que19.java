package src;

// Print all possible paths in maze to reach last cell (Only right & downside movement allowed)

public class Que19 {
    public static void main(String[] args) {
        printAllMazePaths(3, 3, "");
    }
    
    public static void printAllMazePaths(int row, int col, String path) {
        if (row == 1 && col == 1) {
            System.out.println(path);
            return;
        } else if (row < 1 || col < 1) {
            return;
        }

        if (row > 0) {
            printAllMazePaths(row - 1, col, path + 'D');
        }

        if (col > 0) {
            printAllMazePaths(row, col - 1, path + 'R');
        }
    }
}
