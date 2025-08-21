// ! Topic: Arrays

// ? Medium Difficulty

// * My Solution: 2ms
// * Similar Problems: 413, 2110, 2414

package LeetCode;

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int count = 0;
        long max = 0;
        for (int n : nums) {
            if (n == 0) {
                count++;
                max += count;
            } else
                count = 0;
        }
        return max;
    }
}

public class ZeroSubArray_2348 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[] nums = { 1, 3, 0, 0, 2, 0, 0, 4 };
        System.out.println(sol.zeroFilledSubarray(nums));
    }
}
