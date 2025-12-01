//! Topics: String, Greedy, Counting

//? Medium Difficulty

//* Better Solution: 8ms

class Solution {
    public int maxOperations(String s) {
        int ones = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ones++;
            else if (i > 0 && s.charAt(i - 1) == '1')
                res += ones;
        }
        return res;
    }
}

public class MaxNumOpsToMoveOnesToEnd_3228 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = s = "1001101";
        System.out.println(sol.maxOperations(s));
    }
}