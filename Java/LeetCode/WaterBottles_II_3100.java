//! Topics: Math, Simulation

//? Medium Difficulty

//* Best Solution: 0ms

class Solution {
    public int maxBottlesDrunk(int numBottles, int x) {
        int ans = numBottles;
        while (numBottles >= x) {
            numBottles -= x - 1;
            x++;
            ans++;
        }
        return ans;
    }
}

public class WaterBottles_II_3100 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxBottlesDrunk(13, 6));
    }
}