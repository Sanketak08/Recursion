package src;

// Print all subsequences of a given string

//* There is differene in "get" & "print" subsequences
//* Que10 gives solution for "get" & this queston for "print"

public class Que16 {
    public static void main(String[] args) {
        printSubsequences("", "abc");
    }
    
    public static void printSubsequences(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        printSubsequences(p + ch, up.substring(1));
        printSubsequences(p, up.substring(1));
    }
}
