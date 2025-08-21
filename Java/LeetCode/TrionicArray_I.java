package LeetCode;

class Solution {
    public boolean isTrionic(int[] nums) {
        int p = 1;
        int q = 1;
        int c = 0;
        while (p < nums.length && q < nums.length) {
            if (c % 2 == 0)
                p = increase(nums, q);
            else
                q = decrease(nums, p);
            if (p == -1 || q == -1)
                return false;
            c++;
        }
        if (c == 3) {
            return true;
        }
        return false;
    }

    public int increase(int[] nums, int i) {
        int j = i;
        while (i < nums.length && nums[i] > nums[i - 1])
            i++;
        if (i == j)
            return -1;
        return i;
    }

    public int decrease(int[] nums, int i) {
        int j = i;
        while (i < nums.length && nums[i] < nums[i - 1])
            i++;
        if (i == j)
            return -1;
        return i;
    }
}

public class TrionicArray_I {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[] nums = { 1, 3, 5, 4, 2, 6 };
        boolean result = sol.isTrionic(nums);
        System.out.println(result);
    }
}