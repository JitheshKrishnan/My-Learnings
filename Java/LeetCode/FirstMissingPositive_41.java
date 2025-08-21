// ! Topics: Arrays

// ? Hard Difficulty

// * Similar Problems: 268, 287, 448
// * My Solution: 18ms

package LeetCode;

import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == j)
                j++;
            else if (nums[i] > j)
                return j;
        }
        return j;
    }
}

public class FirstMissingPositive_41 {
    public static void main(String[] a) {
        int[] nums = { 0, 1, 2 };
        Solution sol = new Solution();
        System.out.println(sol.firstMissingPositive(nums));
    }
}

// * Better Solution: 1ms
// class Solution {
// public int firstMissingPositive(int[] nums) {
// int i = 0;
// while (i < nums.length) {
// int j = nums[i] - 1;
// if (j >= 0 && j < nums.length && nums[i] != nums[j]) {
// swap(nums, i, j);
// } else {
// i++;
// }
// }
// i = 0;
// while (i < nums.length) {
// if (nums[i] != i + 1) {
// return i + 1;
// }
// i++;
// }
// return nums.length + 1;
// }
// private void swap(int[] nums, int i, int j) {
// int tmp = nums[i];
// nums[i] = nums[j];
// nums[j] = tmp;
// }
// }