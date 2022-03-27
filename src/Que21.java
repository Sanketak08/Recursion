package src;

// Print all possible permutatios of given string

public class Que21 {
    public static void main(String[] args) {
        printPermutations("", "abc");
    }
    
    public static void printPermutations(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i); // eg => if up = "abcde", ch = 'c'
            String leftPartOfUp = up.substring(0, i); // this will be "ab"
            String rightPartOfUp = up.substring(i + 1); // this will be "de"
            printPermutations(p + ch, leftPartOfUp + rightPartOfUp);
        }

    }
}
