//! Toics: Math, String

//? Medium Difficulty

//* My Better Solution: 4ms

class Solution {
    public static int numSub(String s) {
        long result = 0, count = 0, mod = 1000000007;
        for(char c : s.toCharArray()){
            if(c == '1'){
                count++;
                result = (result + count) % mod;
            }
            else count = 0;
        }
        return (int) result;
    }
}

public class NumOfSubstrsWithOnly1s_1513 {
    public static void main(String[] args) {
        String s = "0110111";
        System.out.println(Solution.numSub(s));
    }
}
