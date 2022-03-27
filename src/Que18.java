package src;

// Print all the paths from 'nth' step to '0th' step

public class Que18 {
    public static void main(String[] args) {
        printAllPaths(4, "");
    }
    
    public static void printAllPaths(int n, String p) {
        if (n == 0) {
            System.out.println(p);
            return;
        } else if (n < 0) {
            return;
        }
        
        printAllPaths(n - 1, p + '1');
        printAllPaths(n - 2, p + '2');
        printAllPaths(n - 3, p + '3');
    }
}
