// ! Pattern: Two Pointers
// ? Medium Difficulty

package LeetCode;

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}

public class ContWithMostWater_11 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int maxArea = sol.maxArea(height);
        System.out.println(maxArea);
    }
}
