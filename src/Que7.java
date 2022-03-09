package src;
//Print max of array

public class Que7 {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] arr = { -1, -789, -3, -45, -4, -6 };
        System.out.println(maxOfArray(arr, 0));
        System.out.println(maxOfArrayNew(arr, 0));
    }
    
    static int maxOfArray(int[] arr, int index) {
        if (index == arr.length) {
            return max;
        }

        if (max < arr[index]) {
            max = arr[index];
        }

        return maxOfArray(arr, index + 1);
    }

    //* Without using static variable
    static int maxOfArrayNew(int[] arr, int index) {
        if (index == arr.length) {
            return max;
        }

        int tempMax = maxOfArrayNew(arr, index + 1);

        return tempMax > arr[index] ? tempMax : arr[index];
    }
}
