//! Topics: Array, Dynamic Programming, Matrix

//? Hard Difficulty

//* Better Solution: 71ms

class Solution {
    public static final int MOD = 1_000_000_007;
    public static int numberOfPaths(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][][] dp = new int[m][n][k];
        dp[0][0][grid[0][0] % k] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                for(int r = 0; r < k; r++){
                    if(dp[i][j][r] == 0) continue;
                    if(i+1 < m){
                        int nextValue = grid[i+1][j];
                        int nextRemainder = (r + nextValue) % k;
                        dp[i+1][j][nextRemainder] += dp[i][j][r];
                        dp[i+1][j][nextRemainder] %= MOD;
                    }
                    if(j+1 < n){
                        int nextValue = grid[i][j+1];
                        int nextRemainder = (r + nextValue) % k;
                        dp[i][j+1][nextRemainder] += dp[i][j][r];
                        dp[i][j+1][nextRemainder] %= MOD;
                    }
                }
            }
        }
        return dp[m-1][n-1][0];
    }
}

public class PathsInMatrixWhoseSumIsDivisibleByK_2435 {
    public static void main(String[] args) {
        int[][] grid = {{5,2,4},{3,0,5},{0,7,2}};
        int k = 3;
        System.out.println(Solution.numberOfPaths(grid, k));
    }
}
