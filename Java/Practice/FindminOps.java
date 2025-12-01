import java.util.*;

//! Find Minimum Operations
// class Solution {
//     public int finMinOperations(int[] nums){
//         Arrays.sort(nums);
//         int ops = 0;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] < i+1){
//                 ops += (i+1-nums[i]);
//                 nums[i] = i+1;
//             }
//         }
//         return ops;
//     }
// }

//! Numerology
// class Solution{
//     public int numerology(String s){
//         int result = 0;
//         for(int i = 0; i < s.length(); i++){
//             int c = s.charAt(i);
//             if(c%2==1|| (i+1)%2==1) result += c*(i+1);
//         }
//         return result;
//     }
// }

//! Data Packets (Stack)
// class Solution{
//     public int calculateTotalSkipCount(int[] a){
//         int n = a.length;
//         int totalSkipCount = 0;
//         Stack<Integer> stack = new Stack<>();
//         for(int i = 0; i < n; i++){
//             while(!stack.isEmpty() && a[i] > stack.peek()){
//                 stack.pop();
//                 totalSkipCount++;
//             }
//             stack.push(a[i]);
//         }
//         return totalSkipCount;
//     }
// }

//! Packaging items and lines
// class Solution{
//     public int countItems(String s){
//         int count = 0;
//         for(int i = 1; i < s.length()-1; i++){
//             boolean left = "0123456789".contains(String.valueOf(s.charAt(i-1)));
//             boolean right = "0123456789".contains(String.valueOf(s.charAt(i+1)));
//             if(!"0123456789".contains(String.valueOf(s.charAt(i))) && left && right) count++;
//         }
//         return count;
//     }

//     //? Better way
//     public static int countWrappedItems(String s){
//         int count = 0;
//         for(int i = 1; i < s.length()-1; i++){
//             if(Character.isDigit(s.charAt(i-1))
//                 && Character.isLowerCase(s.charAt(i))
//                 && Character.isDigit(s.charAt(i+1))) count++;
//         }
//         return count;
//     }
// }

//! Count Valid Subarrays

class Solution{
    public static int countValidSubarrays(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] + nums[i+2] == nums[i+1]) count++;
        }
        return count;
    }
}

public class FindminOps {
    public static void main(String[] args) {
        // Solution sol = new Solution();
        // int[] nums = {1,1,3,3,4};
        // String s = "JAMES";
        // int[] a = {3,1,4,2,5,1};
        // String s = "5aart6i7io8o5o56"; // "1a2b3c4d5"
        int[] nums = {3,1,5,4,3,6,3}; // {1,2,1,3,5,2,4,2}
        System.out.println(Solution.countValidSubarrays(nums));
    }
}