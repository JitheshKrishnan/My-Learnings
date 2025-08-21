// ! Strings

package LeetCode;

class Solution {
    public String generateTheString(int n) {
        String abc = "abc";
        String oddCount = "";
        if (n == 0)
            return "";

        oddCount += abc.charAt(0);

        if (n == 1)
            return oddCount;

        if (n % 2 == 0) {
            for (int i = 1; i < n; i++)
                oddCount += abc.charAt(1);
        } else {
            oddCount += abc.charAt(1);
            for (int i = 2; i < n; i++)
                oddCount += abc.charAt(2);
        }
        return oddCount;
    }
}

public class OddCountString_1374 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int n = 9;
        String oddCount = sol.generateTheString(n);
        System.out.println(oddCount);
    }
}
