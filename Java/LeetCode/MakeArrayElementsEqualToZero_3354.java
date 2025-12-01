//! Topics: Array, Simulation, Prefix Sum

//* My Better Solution: 3ms

import java.util.Arrays;

class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length, valid = 0, left = 0;
        int right = Arrays.stream(nums).sum();
        for(int i = 0; i < n; i++){
            left += nums[i];
            right -= nums[i];
            if(nums[i] != 0) continue;
            if(left == right) valid += 2;
            if(Math.abs(left - right) == 1) valid++;
        }
        return valid;
    }
}

public class MakeArrayElementsEqualToZero_3354 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,0,2,0,3};
        System.out.println(sol.countValidSelections(nums));
    }
}
