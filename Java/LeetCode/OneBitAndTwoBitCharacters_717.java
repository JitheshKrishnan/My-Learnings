//! Topics: Array

//* My Best Solution: 0ms

class Solution {
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0, n = bits.length;
        while(i < n-1) i += bits[i] + 1;
        return i == n-1;
    }
}

public class OneBitAndTwoBitCharacters_717 {
    public static void main(String[] args){
        int[] bits = {1,1,1,0};
        System.out.println(Solution.isOneBitCharacter(bits));
    }
}