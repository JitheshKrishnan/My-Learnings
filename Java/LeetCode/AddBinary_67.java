// ! Topic: Bit Manipulation

// ! My solution: 6ms

package LeetCode;

import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }
}

public class AddBinary_67 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        System.out.println(sol.addBinary("1101", "101"));
    }
}

// * Better Solution: 1ms

// class Solution {
// public String addBinary(String a, String b) {
// StringBuilder sb = new StringBuilder();
// int carry = 0;
// int i = a.length() - 1;
// int j = b.length() - 1;

// while (i >= 0 || j >= 0 || carry == 1) {
// if (i >= 0)
// carry += a.charAt(i--) - '0';
// if (j >= 0)
// carry += b.charAt(j--) - '0';
// sb.append(carry % 2);
// carry /= 2;
// }
// return sb.reverse().toString();
// }
// }