//! Topics: Array, Math

//* My Best Solution: 0ms

class Solution {
    public static int minimumOperations(int[] nums) {
        int operations = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%3 != 0) operations++;
        }
        return operations;
    }
}

public class FindMinOpsToMakeAllElementsDivByThree_3190 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Solution.minimumOperations(nums));
    }
}
