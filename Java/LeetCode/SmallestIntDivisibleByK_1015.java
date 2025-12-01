//! Topics: Hash Table, Math

//? Medium Difficulty

//* Best Solution: 2ms

class Solution {
    public static int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0) return -1;
        int value = 0;
        for(int i = 1; i <= k; i++){
            value = (value * 10 + 1) % k;
            if(value == 0) return i;
        }
        return -1;
    }
}

public class SmallestIntDivisibleByK_1015 {
    public static void main(String[] args) {
        int k = 7;
        System.out.println(Solution.smallestRepunitDivByK(k));
    }
}