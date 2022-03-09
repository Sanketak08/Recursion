package src;

// Print last occurence of element

public class Que9 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 4, 5, 6, 8, 7 };
        System.out.println(lastOccurence(arr, 8, 8));
        System.out.println(lastOccurenceNew(arr, 0, 8));
    }
    
    static int lastOccurence(int[] arr, int index, int k) {
        if (index < 0) {
            return -1;
        }

        if (arr[index] == k) {
            return index;
        }
        return lastOccurence(arr, index - 1, k);
    }

    static int lastOccurenceNew(int[] arr, int index, int k) {
        if (index == arr.length) {
            return -1;
        }

        int lastTemp = lastOccurenceNew(arr, index + 1, k);
        if (lastTemp == -1) {
            if (arr[index] == k) {
                return index;
            } else {
                return -1;
            }
        }
        return lastTemp;
    }
}
