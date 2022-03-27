package src;

// Print all the keypad combinations

public class Que17 {
    static String[] codes = { ",.;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        printCombinations("", "23");
    }
    
    public static void printCombinations(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        String charCode = codes[ch - '0' - 1];

        for (int i = 0; i < charCode.length(); i++) {
            char codeCh = charCode.charAt(i);
            printCombinations(p + codeCh, up.substring(1));
        }
    }
}
