//! Topics: Math, String, Simulation, Combinatorics, Number Theory

//* Best Solution: 1ms

class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = s.charAt(i) - '0';
        while(n > 2){
            for(int i = 0; i < n-1; i++){
                arr[i] = (arr[i] + arr[i+1])%10;
            }
            n--;
        }
        return arr[0] == arr[1];
    }
}

public class EqualDigitsInStrAfterOps_I_3461 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "3902";
        System.out.println(sol.hasSameDigits(s));
    }
}