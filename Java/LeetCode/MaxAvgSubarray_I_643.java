// ! Pattern: Sliding Window

package LeetCode;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int windowStart = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k - 1) {
                max = Math.max(max, sum);
                sum -= nums[windowStart];
                windowStart++;
            }
        }
        return (double) max / k;
    }
}

public class MaxAvgSubarray_I_643 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        double result = sol.findMaxAverage(nums, k);
        System.out.println(result);
    }
}