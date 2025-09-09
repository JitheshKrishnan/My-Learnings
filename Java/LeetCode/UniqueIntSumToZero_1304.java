//! Topics: Array, Math

class Solution {
    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int num = 1;
        if(nums.length%2 == 1) {
            nums[0] = 0;
            for(int i = 1; i < n; i++){
                if(i%2 == 0){
                    nums[i] = -(num);
                    num++;
                }
                else
                    nums[i] = num;
            }
        }
        else{
            for(int i = 0; i < n; i++){
                if(i%2 == 0)
                    nums[i] = -(num);
                else{
                    nums[i] = num;
                    num++;
                }
            }
        }
        return nums;
    }
}

public class UniqueIntSumToZero_1304{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.sumZero(11);
        for(int n : result)
            System.out.print(n + " ");
    }
}