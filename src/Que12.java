package src;

// Get all cobinations of keypad

public class Que12 {
    public static void main(String[] args) {
        getAllCombinations("", "23");
    }
    
    public static void getAllCombinations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
            char ch = (char) ('a' + i);
            getAllCombinations(p + ch, up.substring(1));
        }
    }
}
