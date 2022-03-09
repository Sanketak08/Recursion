package src;

import java.util.ArrayList;

// Print all indices of an element

public class Que10 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 4, 5, 6, 2 };
        ArrayList<Integer> result = new ArrayList<>();

        allOccurences(arr, 0, 2, result);
        
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
    
    static ArrayList<Integer> allOccurences(int[] arr, int index, int k, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == k) {
            list.add(index);
        }

        return allOccurences(arr, index + 1, k, list);
    }
}
