//! Topics: Arrays, Hash Table

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) >= max){
                if(map.get(nums[i]) != max){
                    count = map.get(nums[i]);
                    max = map.get(nums[i]);
                    continue;
                }
                count+=map.get(nums[i]);
                max = map.get(nums[i]);
            }
        }
        return count;
    }
}

public class CountElementsWithMaxFreq_3005 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,2,3,1,4};
        System.out.println(sol.maxFrequencyElements(nums));
    }
}
