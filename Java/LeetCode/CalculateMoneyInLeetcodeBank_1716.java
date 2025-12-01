//! Topics: Math

//* My Best Solution: 0ms

class Solution {
    public int totalMoney(int n) {
        int weeks = n/7, days = n%7, savings = 0;
        savings += weeks*28 + 7*(weeks*(weeks-1)/2) + days*weeks + days*(days+1)/2;
        return savings;
    }
}

public class CalculateMoneyInLeetcodeBank_1716 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 67;
        System.out.println(sol.totalMoney(n));
    }   
}