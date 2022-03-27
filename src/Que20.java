package src;

// Print all paths in maze where we can jump to 1st coloumn, 2nd column & 3rd column (vertically,
// horizontally & diagonally)

public class Que20 {
    public static void main(String[] args) {
        printAllPathsWithJumpsAllowed(4, 4, "");
    }
    
    public static void printAllPathsWithJumpsAllowed(int row, int col, String path) {
        if (row == 1 && col == 1) {
            System.out.println(path);
            return;
        } else if (row < 1 || col < 1) {
            return;
        }

        if (row > 0) {
            printAllPathsWithJumpsAllowed(row - 1, col, path + "V1");
            printAllPathsWithJumpsAllowed(row - 2, col, path + "V2");
            printAllPathsWithJumpsAllowed(row - 3, col, path + "V3");
        }

        if (col > 0) {
            printAllPathsWithJumpsAllowed(row, col - 1, path + "H1");
            printAllPathsWithJumpsAllowed(row, col - 2, path + "H2");
            printAllPathsWithJumpsAllowed(row, col - 3, path + "H3");
        }

        if (row > 0 && col > 0) {
            printAllPathsWithJumpsAllowed(row - 1, col - 1, path + "D1");
            printAllPathsWithJumpsAllowed(row - 2, col - 2, path + "D2");
            printAllPathsWithJumpsAllowed(row - 3, col - 3, path + "D3");
        }
    }
}
