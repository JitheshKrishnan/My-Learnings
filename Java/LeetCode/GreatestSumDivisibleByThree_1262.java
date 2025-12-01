//! Topics: Array, Dynamic Programming, Greedy, Sorting

//? Medium Difficulty

//* Better Solution: 9ms

class Solution {
    public static int maxSumDivThree(int[] nums) {
        int[] dp = {0, 0, 0};

        for (int num : nums) {
            int[] prev = dp.clone();
            for (int cur : prev) {
                int s = cur + num;
                dp[s % 3] = Math.max(dp[s % 3], s);
            }
        }
        return dp[0];
    }
}

public class GreatestSumDivisibleByThree_1262 {
    public static void main(String[] args) {
        int[] nums = {3,6,5,1,8};
        System.out.println(Solution.maxSumDivThree(nums));
    }
}
