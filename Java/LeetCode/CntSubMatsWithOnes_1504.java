// ! Topic: Monotonic Stack

// ? Medium Difficulty

// * Not My Solution, Gotta Rework!
package LeetCode;

class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] h = new int[n];
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                h[j] = mat[i][j] == 1 ? h[j] + 1 : 0;
            }

            for (int j = 0; j < n; j++) {
                int mn = h[j];
                for (int k = j; k >= 0 && mn > 0; k--) {
                    mn = Math.min(mn, h[k]);
                    cnt += mn;
                }
            }
        }
        return cnt;
    }
}

public class CntSubMatsWithOnes_1504 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[][] mat = { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 1, 0 } };
        System.out.println(sol.numSubmat(mat));
    }
}
