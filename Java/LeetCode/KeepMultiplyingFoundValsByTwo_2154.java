//! Topics: Array, Hash Table, Sorting, Simulation

//* My  Solution: 6ms

import java.util.*;

class Solution {
    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == original) {
                original *= 2;
                left = 0;
                right = nums.length-1;
            }
            else if(nums[mid] > original) right = mid-1;
            else left = mid+1;
        }
        return original;
    }
}

//* Best Solution: 1ms

// class Solution {
//     public int findFinalValue(int[] nums, int original) {
//         boolean[] found = new boolean[1001];
//         for(int n : nums) found[n] = true;
//         while(original <= 1000){
//             if(found[original]) original *= 2;
//             else break;
//         }
//         return original;
//     }
// }

public class KeepMultiplyingFoundValsByTwo_2154 {
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        System.out.println(Solution.findFinalValue(nums, original));
    }
}
