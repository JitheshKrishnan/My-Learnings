//! Topics: Hash Table, Math, Backtracking, Counting, Enumeration

//? Medium Difficulty

//* Better Solution: 1ms

import java.util.*;

class Solution {
    public long generate(long n, long current, long remaining, long[] count){
        if(remaining == 0){
            if(current > n){
                for(int d = 1; d < 10; d++){
                    if(count[d] > 0 && count[d] != d) return 0;
                }
                return current;
            }
            return 0;
        }

        long result = 0;
        for(int d = 1; d < 10 && result == 0; d++){
            if(count[d] < d && d - count[d] <= remaining){
                count[d]++;
                result = generate(n, current*10+d, remaining-1, count);
                count[d]--;
            }
        }
        return result;
    }
    public int nextBeautifulNumber(int n) {
        String s = String.valueOf(n);
        long len = s.length();
        long[] count = new long[10];
        long result = generate(n, 0, len, count);
        if(result == 0) {
            Arrays.fill(count, 0);
            result = generate(0, 0, len+1, count);
        }
        return (int)result;
    }
}

public class NextGreaterNumericallyBalancedNumber_2048 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 125;
        System.out.println(sol.nextBeautifulNumber(n));
    }
}