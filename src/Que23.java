package src;

// Terget sum problem (Print all the subsets of array which sums equal to the given sum)

public class Que23 {
    public static void main(String[] args) {
        targetSum(new int[] { 10, 20, 30, 40, 50 }, 0, "", 0, 60);
    }
    
    public static void targetSum(int[] arr, int index, String set, int sum, int target) {
        if (arr.length == index) {
            if (sum == target) {
                System.out.println(set);
            }
            return;
        }

        // Number in the array is added in subset
        targetSum(arr, index + 1, set + arr[index] + ", ", sum + arr[index], target);

        // Number is not added in subset
        targetSum(arr, index + 1, set, sum, target);
    }
}
