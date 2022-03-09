package src;

// Calculate (x power n)

public class Que3 {
    public static void main(String[] args) {
        System.out.println("Result -> " + calcPower(2, 14));
        System.out.println("Result Logarithmic -> " + calcPowerLog(2, 14));
    }
    
    static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * calcPower(x, n - 1);
    }

    // Time complexity is minimum, so use this approach
    static int calcPowerLog(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        }

        // eg => n=113; x^n/2)*x^n/2 => x^56*x^56*x
        return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
    }
}
