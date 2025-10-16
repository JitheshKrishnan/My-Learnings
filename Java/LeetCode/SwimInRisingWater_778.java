//!Topics: Topics, Array, Binary Search, Depth-First Search, Breadth-First Search, Union Find, Heap (Priority Queue), Matrix

//? Hard Difficulty

//* Better Solution: 20ms, Beats 12.59%

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int swimInWater(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        List<int[]> edges = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0)
                    edges.add(new int[]{Math.max(grid[i][j], grid[i-1][j]), i*n+j, (i-1)*n+j});
                if (j > 0)
                    edges.add(new int[]{Math.max(grid[i][j], grid[i][j-1]), i*n+j, i*n+j-1});
            }
        }
        
        Collections.sort(edges, (a, b) -> a[0] - b[0]);
        int[] parent = new int[m * n];
        for (int i = 0; i < m * n; i++) parent[i] = i;
        
        for (int[] edge : edges) {
            union(parent, edge[1], edge[2]);
            if (find(parent, 0) == find(parent, m*n-1))
                return edge[0];
        }
        return grid[0][0];
    }
    
    private int find(int[] parent, int x) {
        if (parent[x] != x)
            parent[x] = find(parent, parent[x]);
        return parent[x];
    }
    
    private void union(int[] parent, int x, int y) {
        parent[find(parent, x)] = find(parent, y);
    }
}

public class SwimInRisingWater_778 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid = {{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
        System.out.println(sol.swimInWater(grid));
    }
}
