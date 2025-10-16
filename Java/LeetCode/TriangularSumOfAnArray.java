//! Topics: Array, Math, Simulation, Combinatorics

//? Medium Difficulty

class Solution {
    public int triangulation(int[] nums){
        if(nums.length == 1) return nums[0];
        else{
            int[] newNums = new int[nums.length-1];
            for(int i = 0; i < nums.length-1; i++)
                newNums[i] = (nums[i] + nums[i+1])%10;
            return triangulation(newNums);
        }
    }
    public int triangularSum(int[] nums) {
        return triangulation(nums);
    }
}

public class TriangularSumOfAnArray{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,3,4,5};
        System.out.println(sol.triangularSum(nums));;
    }
}