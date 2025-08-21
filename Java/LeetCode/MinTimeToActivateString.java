// ? Medium Difficulty

package LeetCode;

class Solution {
    public int minTime(String s, int[] order, int k) {
        int j = 0;
        int count = 0;
        int substringCount = 0;
        char[] arr = s.toCharArray();
        for (int t = 0; t < order.length; t++) {
            arr[order[t]] = '*';
            s = new String(arr);
            count = countChar(s, '*');
            if (count == 1) {
                substringCount = s.indexOf("*") == 0 || s.indexOf("*") == s.length() - 1 ? s.length() : s.length() + 1;
            } else {
                substringCount = 2 * (s.length()) - 1 + j;
                j++;
            }
            if (substringCount >= k)
                return t;
        }
        return -1;
    }

    public int countChar(String str, char targetChar) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }
}

public class MinTimeToActivateString {
    public static void main(String[] a) {
        Solution sol = new Solution();
        String s = "cat";
        int[] order = { 0, 2, 1 };
        int k = 4;
        int result = 0;
        result = sol.minTime(s, order, k);
        System.out.println(result);
    }
}