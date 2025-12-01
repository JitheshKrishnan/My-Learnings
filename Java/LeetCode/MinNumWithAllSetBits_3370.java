//! Topics: Math, Bit Manipulation

class Solution {
    public int smallestNumber(int n) {
        int res = 2;
        while(res-1 < n) res *= 2;
        return res-1;
    }
}

public class MinNumWithAllSetBits_3370 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5426;
        System.out.println(sol.smallestNumber(n));
    }
}