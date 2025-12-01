//! Topics: Array, Hash Table, Prefix Sum

//? Medium Difficulty

//* Best Solution: 4ms

class Solution {
    public static long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] bucket = new long[k];
        for(int i = 0; i < k-1; i++) bucket[i] = Long.MAX_VALUE/2;
        long result = Long.MIN_VALUE;
        long prefix = 0;
        for(int i = 0; i < n; i++){
            prefix += nums[i];
            int mod = i % k;
            result = Math.max(result, prefix - bucket[mod]);
            bucket[mod] = Math.min(bucket[mod], prefix);
        }
        return result;
    }
}

public class MaxSubarraySumWithLenDivisibleByK_3381 {
    public static void main(String[] args) {
        int[] nums = {-5,1,2,-3,4};
        int k = 2;
        System.out.println(Solution.maxSubarraySum(nums, k));
    }
}