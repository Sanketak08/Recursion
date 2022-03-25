package src;

import java.util.ArrayList;

// Find all paths in maze where we can jump to 1st coloumn, 2nd column & 3rd column (vertically,
// horizontally & diagonally)

public class Que15 {
    public static void main(String[] args) {
        ArrayList<String> result = getAllPathsWithJump(0, 0, 3, 3);
        System.out.println(result);
    }
    
    public static ArrayList<String> getAllPathsWithJump(int sr, int sc, int dr, int dc) {
        // Base conditions
        if (sc == dc - 1 && sr == dr - 1) {
            ArrayList<String> newList = new ArrayList<>();
            newList.add("");
            return newList;
        } else if (sc > dc - 1 && sr > dr - 1) {
            ArrayList<String> newList = new ArrayList<>();
            return newList;
        }

        // Horizontal traversing 
        ArrayList<String> hpath1 = new ArrayList<>();
        ArrayList<String> hpath2 = new ArrayList<>();
        ArrayList<String> hpath3 = new ArrayList<>();
        if (sc < dc) {
            hpath1 = getAllPathsWithJump(sr, sc + 1, dr, dc);
            hpath2 = getAllPathsWithJump(sr, sc + 2, dr, dc);
            hpath3 = getAllPathsWithJump(sr, sc + 3, dr, dc);
        }

        // Vertical traversing
        ArrayList<String> vpath1 = new ArrayList<>();
        ArrayList<String> vpath2 = new ArrayList<>();
        ArrayList<String> vpath3 = new ArrayList<>();
        if (sr < dr) {
            vpath1 = getAllPathsWithJump(sr + 1, sc, dr, dc);
            vpath2 = getAllPathsWithJump(sr + 2, sc, dr, dc);
            vpath3 = getAllPathsWithJump(sr + 3, sc, dr, dc);
        }

        // Diagonally Traversing
        ArrayList<String> dpath1 = new ArrayList<>();
        ArrayList<String> dpath2 = new ArrayList<>();
        ArrayList<String> dpath3 = new ArrayList<>();
        if (sr < dr && sc < dc) {
            dpath1 = getAllPathsWithJump(sr + 1, sc + 1, dr, dc);
            dpath2 = getAllPathsWithJump(sr + 2, sc + 2, dr, dc);
            dpath3 = getAllPathsWithJump(sr + 3, sc + 3, dr, dc);
        }

        ArrayList<String> allPaths = new ArrayList<>();

        // Combining all horizontal pahs
        for (String path : hpath1) {
            allPaths.add("H1" + path);
        }

        for (String path : hpath2) {
            allPaths.add("H2" + path);
        }

        for (String path : hpath3) {
            allPaths.add("H3" + path);
        }

        // Combining all vertical pahs
        for (String path : vpath1) {
            allPaths.add("V1" + path);
        }

        for (String path : vpath2) {
            allPaths.add("V2" + path);
        }

        for (String path : vpath3) {
            allPaths.add("V3" + path);
        }

        // Combining all diagonal pahs
        for (String path : dpath1) {
            allPaths.add("D1" + path);
        }

        for (String path : dpath2) {
            allPaths.add("D2" + path);
        }

        for (String path : dpath3) {
            allPaths.add("D3" + path);
        }

        return allPaths;
    }
}
