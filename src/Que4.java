package src;

// Print zig-zag pattern

public class Que4 {
    public static void main(String[] args) {
        printZigzag(123);
    }
    
    // Refer notes
    static void printZigzag(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n); //Pre
        printZigzag(n - 1);
        System.out.print(n); // In
        printZigzag(n - 1);
        System.out.print(n); // Post
    }

}
