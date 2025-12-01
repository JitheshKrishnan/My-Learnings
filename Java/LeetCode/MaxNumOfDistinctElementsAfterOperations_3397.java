//! Topics: Array, Greedy, Sorting

//? Medium Difficulty

//* Better Solution: 18ms

import java.util.*;

class Solution {
    public int maxDistinctElements(int[] arr, int diff) {
        if (arr.length == 0) return 0;
        Arrays.sort(arr);
        int count = 0;
        int prev = Integer.MIN_VALUE >> 1;
        for (int i = 0, n = arr.length; i < n; i++) {
            int a = arr[i];
            int low = a - diff;
            int high = a + diff;
            int x = prev + 1;
            if (x < low) x = low;
            if (x <= high) {
                count++;
                prev = x;
            }
        }
        return count;
    }
}

public class MaxNumOfDistinctElementsAfterOperations_3397 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,2,2,3,3,4};
        int k = 2;
        System.out.println(sol.maxDistinctElements(arr, k));
    }
}
