package src;

import java.util.ArrayList;

// Find all possible paths in maze to reach last cell (Only right & downside movement allowed)

public class Que14 {
    public static void main(String[] args) {
        ArrayList<String> result = allPaths(0, 0, 3, 3);
        System.out.println(result);
    }
    
    public static ArrayList<String> allPaths(int sr, int sc, int dr, int dc) {
        // Base condition
        if (sr == dr - 1 && sc == dc - 1) {
            ArrayList<String> newList = new ArrayList<>();
            newList.add("");
            return newList;
        }
        
        // Refer tree diagram in book
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();

        // Horizontal Check
        if (sc < dc) {
            hPaths = allPaths(sr, sc + 1, dr, dc);
        }

        // Vertical Check
        if (sr < dr) {
            vPaths = allPaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> allPaths = new ArrayList<>();

        // For horizontal paths
        for (String path : hPaths) {
            allPaths.add('R' + path);
        }

        // For vertical paths
        for (String path : vPaths) {
            allPaths.add('D' + path);
        }
        
        return allPaths;
    }
}
