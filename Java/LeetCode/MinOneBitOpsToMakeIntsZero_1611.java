// !Topics: Dynamic Programming, Bit Manipulation, Memoization

//? Hard Difficulty

//* Best Solution

class Solution {
    public int minimumOneBitOperations(int n) {
        int res = 0;
        while (n > 0) {
            res ^= n;
            n >>= 1;
        }
        return res;
    }
}

public class MinOneBitOpsToMakeIntsZero_1611 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 6;
        System.out.println(sol.minimumOneBitOperations(n));
    }
}