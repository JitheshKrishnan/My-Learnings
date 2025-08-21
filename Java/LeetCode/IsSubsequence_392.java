// ! Topic: Strings

// * Similar problems: 792, 1055, 2486

package LeetCode;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        if (s.length() == 0)
            return true;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i))
                j++;
            if (j == s.length())
                return true;
        }
        return false;
    }
}

public class IsSubsequence_392 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        String s = "abc";
        String t = "avwxbewdcdq";
        System.out.println(sol.isSubsequence(s, t));
    }
}
