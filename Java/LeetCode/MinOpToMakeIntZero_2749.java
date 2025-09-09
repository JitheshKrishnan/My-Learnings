//! Topic: Bit Manipulation, Brainteaser, Enumeration

//? Medium Difficulty

//* Better Solution: 0ms

class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int t = 0; t <= 60; t++) {
            long s = (long) num1 - (long) t * num2;
            if (s < 0) continue;
            if (s < t) continue;
            int ones = Long.bitCount(s);
            if (ones <= t) return t;
        }
        return -1;
    }
}

public class MinOpToMakeIntZero_2749 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.makeTheIntegerZero(3, -2));
    }
}