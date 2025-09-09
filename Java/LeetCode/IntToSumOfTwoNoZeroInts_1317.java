//! Topic: Math

class Solution {
    public int[] getNoZeroIntegers(int n) {
        int units = Integer.toString(n).length();
        if(units == 1) {
            int[] list = {n-1, 1};
            return list;
        }
        int temp = n%((int)Math.pow(10, units-1));
        int digit = 0;
        for(int i = units-2; i >= 0; i--){
            int div = (int)Math.pow(10, i);
            int calc = (((temp/div)+1)%10);
            if (calc == 0) calc++;
            calc *= div;
            digit += calc;
            temp %= div;
        }
        int[] list = {digit, n-digit};
        return list;
    }
}

public class IntToSumOfTwoNoZeroInts_1317{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] list = sol.getNoZeroIntegers(53728);
        System.out.print(list[0] + " " + list[1]);
    }
}