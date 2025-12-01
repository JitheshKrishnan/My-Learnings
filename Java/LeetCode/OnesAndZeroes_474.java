//! Topics: Array, String, Dynamic Programming

//? Medium Difficulty

//* Best Solution: 17ms

class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int[] count = countZeroOne(s);
            int zeros = count[0], ones = count[1];
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] countZeroOne(String s) {
        int zeros = 0, ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
            else ones++;
        }
        return new int[]{zeros, ones};
    }
}

public class OnesAndZeroes_474 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"10","0001","111001","1","0"};
        int m = 5, n = 3;
        System.out.println(sol.findMaxForm(strs, m, n));
    }
}
