package src;

import java.util.ArrayList;

// Get all cobinations of keypad

public class Que12 {
    static String[] codes = { ",.;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
        ArrayList<String> result = getAllCombinations("23");
        System.out.println(result);
    }
    
    public static ArrayList<String> getAllCombinations(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);

        ArrayList<String> temp = getAllCombinations(str.substring(1));
        ArrayList<String> result = new ArrayList<>();

        String code = codes[ch - '0' - 1];

        for (int i = 0; i < code.length(); i++) {
            char codeCh = code.charAt(i);
            for (String string : temp) {
                result.add(codeCh + string);
            }
        }

        return result;
    }
}
