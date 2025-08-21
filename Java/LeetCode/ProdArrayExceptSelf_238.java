// ! Topic: Array

// ? Medium Difficulty

// * My Solution: 8ms
// * Similar Problems: 42, 152, 256

package LeetCode;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0;
        double product = 1;
        int zeroIndex = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
                zeroIndex = i;
                continue;
            }
            product *= nums[i];
        }
        if (count > 1)
            return result;
        if (count == 1) {
            result[zeroIndex] = (int) product;
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = (int) (product * ((double) Math.pow(nums[i], -1)));
        }
        return result;
    }
}

public class ProdArrayExceptSelf_238 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = sol.productExceptSelf(nums);
        for (int n : result)
            System.out.print(n + " ");
    }
}

// * Optimal Solution: 2ms

// class Solution {
// public int[] productExceptSelf(int[] nums) {
// int n = nums.length;
// int[] prefix = new int[n];
// int[] suffix = new int[n];
// int[] ans = new int[n];

// prefix[0] = 1;
// suffix[n - 1] = 1;

// // Fill prefix array
// for (int i = 1; i < n; i++) {
// prefix[i] = prefix[i - 1] * nums[i - 1];
// }

// // Fill suffix array
// for (int i = n - 2; i >= 0; i--) {
// suffix[i] = suffix[i + 1] * nums[i + 1];
// }

// // Calculate the result
// for (int i = 0; i < n; i++) {
// ans[i] = prefix[i] * suffix[i];
// }
// return ans;
// }
// }
