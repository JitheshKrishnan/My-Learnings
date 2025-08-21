// ! Arrays (Not sure which topic in LeetCode)

// ! My Solution = 1ms

package LeetCode;

class Solution {
    public int maximum69Number(int num) {
        StringBuilder numString = new StringBuilder(num + "");
        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == '6') {
                numString.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(numString.toString());
    }
}

public class Max69Num_1323 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int num = 9669;
        int result = sol.maximum69Number(num);
        System.out.println(result);
    }
}

// * Better Solution = 0ms

// class Solution {
// public int maximum69Number(int num) {
// char[] digits = String.valueOf(num).toCharArray();
// for (int i = 0; i < digits.length; i++) {
// if (digits[i] == '6') {
// digits[i] = '9';
// break;
// }
// }
// return Integer.parseInt(new String(digits));
// }
// }
