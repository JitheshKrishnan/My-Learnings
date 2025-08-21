// ! Strings

package LeetCode;

class Solution {
    public int strStr(String haystack, String needle) {
        int firstOccurance = 0;
        firstOccurance = haystack.indexOf(needle);
        return firstOccurance;
    }
}

public class FirstOccInStr_28 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        String haystack = "Luffy is still joyboy!";
        String needle = "joyboy";
        System.out.println(sol.strStr(haystack, needle));
    }
}
