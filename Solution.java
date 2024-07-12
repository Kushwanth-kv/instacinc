import java.util.Scanner;

public class Solution {
    public int maxArray(int[] nums) {
        int currentSum = nums[0];
        int maxSoFar = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
        }
        
        return maxSoFar;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of array elements:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = s.maxArray(arr);
        System.out.println("Max subarray sum is: " + result);
    }
}
