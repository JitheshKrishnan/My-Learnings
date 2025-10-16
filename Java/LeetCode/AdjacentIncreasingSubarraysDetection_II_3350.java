//! Topics: Array, Binary Search

//? Medium Difficulty

//* Better Solution: 17ms

import java.util.List;

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int pre = 0, suff = 1, ans = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) suff++;
            else { pre = suff; suff = 1; }
            ans = Math.max(ans, Math.max(suff / 2, Math.min(pre, suff)));
        }
        return ans;
    }
}

public class AdjacentIncreasingSubarraysDetection_II_3350 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> nums = List.of(2,5,7,8,9,2,3,4,3,1);
        System.out.println(sol.maxIncreasingSubarrays(nums));
    }
}