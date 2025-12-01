//! Topics: Array

//* My Best Solution: 1ms

class Solution {
    public static boolean kLengthApart(int[] nums, int k) {
        int lastIdx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                if(lastIdx != -1) {
                    if(i - lastIdx - 1 < k) return false;
                }
                lastIdx = i;
            }
        }
        return true;
    }
}

public class CheckIfAll1sAreAtLeastLenKPlacesAway_1437 {
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,0,0,1};
        int k = 2;
        System.out.println(Solution.kLengthApart(nums, k));
    }
}