//! Topics: Array

//* Best Solution: 1ms

import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        for (int i = 0; i + 2 * k <= n; i++) {
            // Check first subarray [i, i+k-1]
            boolean first = true;
            for (int j = i + 1; j < i + k; j++) {
                if (nums.get(j) <= nums.get(j - 1)) {
                    first = false;
                    break;
                }
            }
            if (!first) continue;

            // Check second subarray [i+k, i+2k-1]
            boolean second = true;
            for (int j = i + k + 1; j < i + 2 * k; j++) {
                if (nums.get(j) <= nums.get(j - 1)) {
                    second = false;
                    break;
                }
            }

            if (second) return true;
        }
        return false;
    }
}

public class AdjacentIncreasingSubarraysDetection_I_3349 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> nums = Arrays.asList(2,5,7,8,9,2,3,4,3,1);
        int k = 3;
        System.out.println(sol.hasIncreasingSubarrays(nums, k));
    }
}
