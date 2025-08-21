// ! Strings

package LeetCode;

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0 && s.charAt(i) != ' '; i--)
            length++;
        return length;
    }
}

public class LenOfLastWord_58 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        String s = "Luffy is still Joyboy!";
        System.out.println(sol.lengthOfLastWord(s));
    }
}
