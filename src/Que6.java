package src;
// Print Array

public class Que6 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        printArray(arr, 0);
    }
    
    static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]); // prints in normal order
        printArray(arr, index + 1);
        System.out.println(arr[index]); // prints in reverse order
    }
}
