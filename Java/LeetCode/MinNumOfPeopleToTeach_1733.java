//! Topics: Math, HashTable, Greedy

//? Medium Difficulty

//* Better Solution: 24ms (But not the best)

import java.util.*;
class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> need = new HashSet<>();
        
        for (int[] p : friendships) {
            int u = p[0] - 1, v = p[1] - 1;
            boolean ok = false;
            for (int x : languages[u]) {
                for (int y : languages[v]) {
                    if (x == y) {
                        ok = true;
                        break;
                    }
                }
                if (ok) break;
            }
            if (!ok) {
                need.add(u);
                need.add(v);
            }
        }
        
        int ans = languages.length + 1;
        for (int i = 1; i <= n; ++i) {
            int cans = 0;
            for (int v : need) {
                boolean found = false;
                for (int c : languages[v]) {
                    if (c == i) {
                        found = true;
                        break;
                    }
                }
                if (!found) cans++;
            }
            ans = Math.min(ans, cans);
        }
        return ans;
    }
}

public class MinNumOfPeopleToTeach_1733 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] languages = {{3,11,5,10,1,4,9,7,2,8,6},{5,10,6,4,8,7},{6,11,7,9},{11,10,4},{6,2,8,4,3},{9,2,8,4,6,1,5,7,3,10},{7,5,11,1,3,4},{3,4,11,10,6,2,1,7,5,8,9},{8,6,10,2,3,1,11,5},{5,11,6,4,2}};
        int[][] friendships = {{7,9},{3,7},{3,4},{2,9},{1,8},{5,9},{8,9},{6,9},{3,5},{4,5},{4,9},{3,6},{1,7},{1,3},{2,8},{2,6},{5,7},{4,6},{5,8},{5,6},{2,7},{4,8},{3,8},{6,8},{2,5},{1,4},{1,9},{1,6},{6,7}};
        int n = 11;
        System.out.println(sol.minimumTeachings(n, languages, friendships));
    }
}