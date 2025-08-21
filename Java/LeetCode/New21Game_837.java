// ! Topic: Dynamic Programming
// ! Pattern: Sliding Window

// ? Could not understand this problem! Need Explanation
// ? Medium Difficulty

package LeetCode;

class Solution {
    public double new21Game(int N, int K, int maxPts) {
        if (K == 0 || N >= K - 1 + maxPts)
            return 1.0;

        double[] dp = new double[maxPts];
        dp[0] = 1.0;
        double windowSum = 1.0, result = 0.0;

        for (int i = 1; i <= N; i++) {
            double prob = windowSum / maxPts;

            if (i < K) {
                windowSum += prob;
            } else {
                result += prob;
            }

            if (i >= maxPts) {
                windowSum -= dp[i % maxPts];
            }

            dp[i % maxPts] = prob;
        }

        return result;
    }
}

public class New21Game_837 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int k = 1;
        int n = 6;
        int maxPts = 10;
        System.out.println(sol.new21Game(n, k, maxPts));
    }
}