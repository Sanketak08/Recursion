package src;

// Print first occurence of given element

public class Que8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 5, 4, 6, 7, 5 };
        System.out.println(firstOccurence(arr, 0, 8));
    }
    
    static int firstOccurence(int[] arr, int index, int k) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == k) {
            return index;
        }
        return firstOccurence(arr, index + 1, k);
    }
}
