// ? Medium Difficulty

package LeetCode;

class Solution {
    public int maxBalancedShipments(int[] weight) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < weight.length; i++) {
            if (max <= weight[i]) {
                max = weight[i];
            } else {
                count++;
                max = 0;
            }
        }
        return count;
    }
}

public class MaximumBalancedShipments {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[] weight = { 2, 5, 1, 4, 3 };
        int result = sol.maxBalancedShipments(weight);
        System.out.println(result);
    }
}