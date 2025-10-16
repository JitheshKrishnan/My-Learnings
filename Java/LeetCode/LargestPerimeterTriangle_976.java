//! Topics: Array, Math, Greedy, Sorting

//* My Solution: 8ms

import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        int perimeter = 0;
        Arrays.sort(nums);
        for(int i = n-1; i >= 2; i--){
            int right = i-1, left = right-1;
            int a = nums[i];
            int b = nums[right];
            int c = nums[left];
            if(a+b>c && b+c>a && a+c>b) return a+b+c; 
        }
        return perimeter;
    }
}

public class LargestPerimeterTriangle_976 {
    public static void main(String[] args) {
        Solution sol =  new Solution();
        int[] nums = {2,1,2};
        System.out.println(sol.largestPerimeter(nums));
    }
}
