package src;

// Factorial of number

public class Que2 {
    public static void main(String[] args) {
        System.out.println("Factorial -> " + fact(4));
    }
    
    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
