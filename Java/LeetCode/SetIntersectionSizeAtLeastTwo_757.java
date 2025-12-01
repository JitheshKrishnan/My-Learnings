//! Topics: Array, Greedy, Sorting

//? Hard Difficulty

//* Better Solution: 9ms

import java.util.Arrays;

class Solution {
    public static int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        int ans = 0;
        int a = -1, b = -1;

        for (int[] it : intervals) {
            int l = it[0], r = it[1];

            if (l > b) {
                a = r - 1;
                b = r;
                ans += 2;
            } else if (l > a) {
                a = b;
                b = r;
                ans += 1;
            }
        }

        return ans;
    }
}

public class SetIntersectionSizeAtLeastTwo_757 {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{2,4},{4,5}};
        System.out.println(Solution.intersectionSizeTwo(intervals));
    }
}