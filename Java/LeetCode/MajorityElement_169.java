package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public static void main(String a[]) {
        int[] nums = { 1, 1, 6, 6, 6, 7, 7 };
        int result = majorityElement(nums);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {
        int max = nums[0];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0));
            if (map.get(max) < map.get(nums[i])) {
                max = nums[i];
            }
        }
        return max;
    }
}