package src;

// Print all the possible encodings of the given string e.g. => I/P = "123", O/P = "abc","aw","lc"

public class Que22 {
    public static void main(String[] args) {
        printEncodings("", "123");
    }
    
    public static void printEncodings(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        } else if (up.length() == 1) {
            char ch = up.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chToInt = ch - '0';
                char code = (char) (chToInt + 'a' - 1);
                System.out.println(p + code);
            }
        } else {
            char ch = up.charAt(0);

            if (ch == '0') {
                return;
            } else {
                // For 1st character only
                int chToInt = ch - '0';
                char code = (char) ('a' + chToInt - 1);
                printEncodings(p + code, up.substring(1));
            }
            // For 1st two characters
            String ch12 = up.substring(0, 2);
            int ch12ToInt = Integer.parseInt(ch12);

            if (ch12ToInt <= 26) {
                char code = (char) ('a' + ch12ToInt - 1);
                printEncodings(p + code, up.substring(2));
            }
        }
    }
}
