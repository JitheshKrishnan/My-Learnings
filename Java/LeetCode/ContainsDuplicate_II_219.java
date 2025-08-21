// ! Pattern: Sliding Window

package LeetCode;

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if (Math.abs(hashMap.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}

public class ContainsDuplicate_II_219 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        boolean result = sol.containsNearbyDuplicate(nums, k);

        System.out.println(result ? "True" : "False");
    }
}
