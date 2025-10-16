//! Topics: Array, Two Pointers, Binary Search, Greedy, Sorting

//? Medium Difficulty

import java.util.Arrays;;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int triangles = 0;
        for(int i = nums.length-1; i >= 2; i--){
            int left = 0, right = i-1;
            while(left < right){
                if(nums[left] + nums[right] > nums[i]){
                    triangles += right - left;
                    right--;
                }
                else left++;
            }
        }
        return triangles;
    }
}

public class ValidTriangleNum_611 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,2,3,4};
        System.out.println(sol.triangleNumber(nums));
    }
}