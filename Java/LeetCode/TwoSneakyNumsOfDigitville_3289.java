//! Topics: Array, Hash Table, Math

//* My Solution: 3ms

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int resultIdx = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.getOrDefault(nums[i], 0) == 0){
                map.put(nums[i], 1);
            }
            else{
                result[resultIdx++] = nums[i];
            }
        }
        return result;
    }
}

public class TwoSneakyNumsOfDigitville_3289 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {7,1,5,4,3,4,6,0,9,5,8,2};
        int result[] = sol.getSneakyNumbers(nums);
        for(int res : result) System.out.print(" " + res);
    }
}