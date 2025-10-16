//! Topics: Math, Simulation

//* Better Solution: 0ms

class Solution {
    public int numWaterBottles(int b, int n) {
        return b + (b - 1) / (n - 1);
    }
}

public class WaterBottles_1518 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.numWaterBottles(9, 3));
    }
}