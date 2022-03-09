package src;
// Tower of Hanoi

public class Que5 {
    public static void main(String[] args) {
        towerOfHanoi(5, 1, 2, 3);
    }

    static void towerOfHanoi(int n, int a, int b, int c) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, a, c, b);
        System.out.println(n + " [" + a + " -> " + b + "]");
        towerOfHanoi(n - 1, c, b, a);
    }
}
