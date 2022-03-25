package src;

import java.util.ArrayList;

// Get all subsequences of string

public class Que11 {
    public static void main(String[] args) {
        ArrayList<String> result = getSubsequences("abc");
        System.out.println(result);
    }
    
    public static ArrayList<String> getSubsequences(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        ArrayList<String> temp = getSubsequences(str.substring(1));

        ArrayList<String> result = new ArrayList<>();
        for (String string : temp) {
            result.add("" + string);
            result.add(ch + string);
        }

        return result;
    }
}
