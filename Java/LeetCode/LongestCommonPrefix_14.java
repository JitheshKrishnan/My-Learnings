package LeetCode;

public class LongestCommonPrefix_14 {
    public static void main(String a[]) {
        String[] strs = { "flower", "flow", "flight" };
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        String smallest = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() <= smallest.length())
                smallest = strs[i];
        }

        String str = "";
        for (int i = 0; i < smallest.length(); i++) {
            int j = 0;

            char compare = strs[j].charAt(i);
            while (strs[j].charAt(i) == compare) {
                if (j + 1 == strs.length) {
                    str = str + strs[j].charAt(i);
                    break;
                }
                j++;
            }
            if (str.length() == i) {
                return str;
            }
        }
        return str;
    }
}