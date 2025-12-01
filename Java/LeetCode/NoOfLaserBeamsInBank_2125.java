//! Topics: Array, Math, String, Matrix

//? Medium Difficulty

//* My Best Solution: 6ms

class Solution {
    public int numberOfBeams(String[] bank) {
        int result = 0;
        int last = ones(bank[0]); 
        int current = 0;
        for(int i = 1; i < bank.length; i++){
            current = ones(bank[i]);
            if(current == 0) continue;
            result += last*(last=current);
        }
        return result;
    }
    public int ones(String str){
        int ones = 0;
        for(int i = 0; i < str.length(); i++) ones += str.charAt(i) - '0';
        return ones;
    }
}

public class NoOfLaserBeamsInBank_2125 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(sol.numberOfBeams(bank));
    }
}