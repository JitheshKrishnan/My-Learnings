//! Topics: Array, Math, Stack, Number Theory

//? Hard Difficulty

//* Better Solution: 29ms

import java.util.*;

class Solution {
    public int findGCD(int a, int b){
        if(b == 0) return a;
        return findGCD(b, a % b);
    }

    public int findLCM(int a, int b){
        return a / findGCD(a, b) * b;
    }
    
    public List<Integer> replaceNonCoprimes(int[] nums) {
        LinkedList<Integer> stack = new LinkedList<>();
        
        for (int num : nums) {
            while (!stack.isEmpty()) {
                int top = stack.getLast();
                int gcd = findGCD(top, num);
                if (gcd > 1) {
                    num = findLCM(top, num);
                    stack.removeLast();
                } else {
                    break;
                }
            }
            stack.add(num);
        }
        
        return new ArrayList<>(stack);
    }
}

public class ReplaceNonCoprimeNums_2197 {
    public static void main(String a[]){
        Solution sol = new Solution();
        int[] nums = {6,4,3,2,7,6,2};
        List<Integer> list = sol.replaceNonCoprimes(nums);
        for(int n : list)
            System.out.print(n + " ");
    }
}
