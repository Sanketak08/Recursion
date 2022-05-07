package src;
// Tower of Hanoi

public class Que5 {
    public static void main(String[] args) {
        towerOfHanoi(3, 1, 2, 3);
    }
    // From => 'a'
    // To => 'b'
    // Auxillary rod => 'c'
    static void towerOfHanoi(int n, int a, int b, int c) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, a, c, b);
        System.out.println(n + " [" + a + " -> " + b + "]");
        towerOfHanoi(n - 1, c, b, a);
    }
}
