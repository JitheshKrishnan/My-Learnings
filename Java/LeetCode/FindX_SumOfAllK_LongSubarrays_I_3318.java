//! Topics: Array, Hash Table, Sliding Window, Heap (Priority Queue)

//* Best Solution: 3ms

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < result.length; i++) {
            int left = i, right = i + k - 1;
            result[i] = findXSumofSubArray(nums, left, right, x);
        }

        return result;
    }

    private int findXSumofSubArray(int[] nums, int left, int right, int x) {
        int sum = 0, distinctCount = 0;
        int[] freq = new int[51]; 

        for (int i = left; i <= right; i++) {
            sum += nums[i];
            if (freq[nums[i]] == 0) {
                distinctCount++;
            }
            freq[nums[i]]++;
        }

        if (distinctCount < x) {
            return sum;
        }

        sum = 0;
        for (int pick = 0; pick < x; pick++) {
            int bestFreq = -1;
            int bestVal = -1;

            for (int val = 50; val >= 1; val--) {
                if (freq[val] > bestFreq) {
                    bestFreq = freq[val];
                    bestVal = val;
                }
            }

            if (bestVal != -1) {
                sum += bestVal * bestFreq;
                freq[bestVal] = 0;
            }
        }
        
        return sum;
    }
}

public class FindX_SumOfAllK_LongSubarrays_I_3318 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,2,2,3,4,2,3};
        int k = 6, x = 2;
        int[] result = sol.findXSum(nums, k, x);
        for(int r : result) System.out.print(r + " ");
    }
}
