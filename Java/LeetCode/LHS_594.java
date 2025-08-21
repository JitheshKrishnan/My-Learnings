// ! Pattern: Sliding Window

package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int max = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (j >= i && j < nums.length) {
            if (Math.abs(nums[i] - nums[j]) == 0) {
                list.add(nums[j]);
                j++;
            } else if (Math.abs(nums[i] - nums[j]) == 1) {
                list.add(nums[j]);
                max = Math.max(max, list.size());
                j++;
            } else {
                list.remove(0);
                i++;
            }
        }
        return max;
    }
}

public class LHS_594 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
        int result = sol.findLHS(nums);
        System.out.println(result);
    }
}
