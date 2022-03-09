package src;

// Print decreasing & increasing numbers
public class Que1 {
    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n); // This wil print in decreasing order (upper part)
        printNumbers(n - 1);
        System.out.println(n); // This will print in increasing order (lower part)
    }
}

// upper part - will execute when function calls are loaded in stack
// lower part - will execute when functions are unloaded from stack