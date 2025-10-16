//! Topics: Array, Hash Table, Math, Greedy

//? Medium Difficulty

//* Better Solution: 7ms

class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] remainderCount = new int[value];

        for (int num : nums) {
            int rem = ((num % value) + value) % value;
            remainderCount[rem]++;
        }

        int result = 0;
        while (remainderCount[result % value] > 0) {
            remainderCount[result % value]--;
            result++;
        }

        return result;
    }
}

public class MinMissingPositiveIntAfterOperations_3598 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,-10,7,13,6,8};
        int value = 7;
        System.out.println(sol.findSmallestInteger(nums, value));
    }   
}