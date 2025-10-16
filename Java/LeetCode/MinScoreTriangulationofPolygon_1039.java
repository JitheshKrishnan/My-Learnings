//! Topic: Array, Dynamic Programming

//? Medium Difficulty

class Solution {
    int[][] dp;
    public int minScoreTriangulation(int[] v) {
        int n = v.length;
        dp = new int[n][n];
        return helper(v, 0, n-1);
    }
    public int helper(int[] v, int i, int j){
        if(j-i < 2) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k = i+1; k < j; k++)
            min = Math.min(min, v[i]*v[k]*v[j] + helper(v, i, k) + helper(v, k, j));
        return dp[i][j] = min;
    }
}

public class MinScoreTriangulationofPolygon_1039 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] values = {1,3,1,4,1,5};
        System.out.println(sol.minScoreTriangulation(values));
    }
}
