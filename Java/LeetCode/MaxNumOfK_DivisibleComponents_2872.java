//! Topics: Tree, Depth-First Search

//? Hard Difficulty

//* Better Solution: 24ms

import java.util.ArrayList;
import java.util.List;

class Solution {
    static boolean vis[];
    static int[] solve(int par, List<Integer>[] g , int val[], int k) {
        vis[par] = true;
        int cur = val[par], breaks = 0;
        for(int x: g[par]) {
            if(vis[x]) continue;
            int child[] = solve(x, g, val, k);
            breaks += child[1];
            if((child[0] % k) == 0) breaks++;
            else cur = (cur + child[0]) % k;
        }
        return new int[]{cur, breaks};
    }
    public static int maxKDivisibleComponents(int n, int[][] edges, int[] val, int k) {
        vis = new boolean[n]; 
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++)
            g[i] = new ArrayList<>();

        for(int x[] : edges) {
            g[x[0]].add(x[1]);
            g[x[1]].add(x[0]);
        }
        return solve(0, g, val, k)[1]+1;
    }
}

public class MaxNumOfK_DivisibleComponents_2872 {
    public static void main(String[] args) {
        int[][] edges = {{0,2},{1,2},{1,3},{2,4}};
        int[] values = {1,8,1,4,4};
        int n  =5, k = 6;
        System.out.println(Solution.maxKDivisibleComponents(n, edges, values, k));
    }
}