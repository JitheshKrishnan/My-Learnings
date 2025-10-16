//! Topics: Array, Depth-First Search, Breadth-First Search, Matrix

//? Medium Difficulty

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    private int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private List<List<Integer>> list = new ArrayList<>();

    private void dfs(int[][] heights, int i, int j, int m, int n, boolean[][] visited){
        if(visited[i][j]) return;
        visited[i][j] = true;
        for(int[] d : dirs){
            int x = i + d[0];
            int y = j + d[1];
            if(x > m-1 || x < 0 || y > n-1 || y < 0) continue;
            if(heights[x][y] < heights[i][j]) continue;
            dfs(heights, x, y, m, n, visited);
        }
    }
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        for(int i = 0; i < m; i++) dfs(heights, i, 0, m, n, pacific);
        for(int j = 0; j < n; j++) dfs(heights, 0, j, m, n, pacific);
        for(int i = 0; i < m; i++) dfs(heights, i, n-1, m, n, atlantic);
        for(int j = 0; j < n; j++) dfs(heights, m-1, j, m, n, atlantic);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(pacific[i][j] && atlantic[i][j]) list.add(Arrays.asList(i, j));
            }
        }

        return list;
    }
}

public class PacificAtlanticWaterFlow_417 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        System.out.println(sol.pacificAtlantic(heights));
    }
}