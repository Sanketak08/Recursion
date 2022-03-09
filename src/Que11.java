package src;

// Get all subsequences of string

public class Que11 {
    public static void main(String[] args) {
        subsequences("", "abc");
    }
    
    public static void subsequences(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsequences(p + ch, up.substring(1));
        subsequences(p, up.substring(1));
    }
}
