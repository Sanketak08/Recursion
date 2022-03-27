package src;

// get all the paths from 'nth' step to '0th' step

import java.util.ArrayList;

public class Que13 {
    public static void main(String[] args) {
        ArrayList<String> result = getAllPaths(4);
        System.out.println(result);
    }

    static ArrayList<String> getAllPaths(int n) {
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1 = getAllPaths(n - 1);
        ArrayList<String> paths2 = getAllPaths(n - 2);
        ArrayList<String> paths3 = getAllPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        // One step is reduced so add 1
        for (String path : paths1) {
            paths.add(1 + path);
        }
        // Two steps are reduced so add 2
        for (String path : paths2) {
            paths.add(2 + path);
        }
        // Three steps are reduced so add 3
        for (String path : paths3) {
            paths.add(3 + path);
        }

        return paths;
    }
}
