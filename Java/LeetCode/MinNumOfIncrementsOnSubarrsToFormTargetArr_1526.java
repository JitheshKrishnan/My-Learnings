//! Topics: Array, Dynamic Programming, Stack, Greedy, Monotonic Stack

//? Hard Difficulty

//* My Best Solution: 3ms

class Solution {
    public int minNumberOperations(int[] target) {
        int result = target[0];
        for(int i = 1; i < target.length; i++){
            if(target[i] > target[i-1]){
                result += target[i] - target[i-1];
            }
        }
        return result;
    }
}

public class MinNumOfIncrementsOnSubarrsToFormTargetArr_1526 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] target = {3,1,5,4,2};
        System.out.println(sol.minNumberOperations(target));
    }    
}
