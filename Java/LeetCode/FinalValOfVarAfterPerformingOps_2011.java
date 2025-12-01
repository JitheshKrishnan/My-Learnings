//! Topics: Array, String, Simulation

//* Better Solution: 4ms

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        return java.util.Arrays.stream(operations).mapToInt(op -> op.charAt(1) == '+' ? 1 : -1).sum();
    }
}

public class FinalValOfVarAfterPerformingOps_2011 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] operations = {"--X","X++","X++"};
        System.out.println(sol.finalValueAfterOperations(operations));
    }
}
