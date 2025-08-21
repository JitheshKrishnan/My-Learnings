// ! pattern: Prefix Sum

package LeetCode;

class NumArray {

    private int[] prefixSum;

    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        this.prefixSum = nums;
    }

    public int sumRange(int left, int right) {
        return left == 0 ? prefixSum[right] : prefixSum[right] - prefixSum[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

public class RangeSumQuery_303 {
    public static void main(String[] a) {
        int[] nums = { -2, 0, 3, -5, 2, -1 };
        NumArray sol = new NumArray(nums);
        int result = sol.sumRange(1, 4);
        System.out.println(result);
    }
}
