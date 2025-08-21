// ! Pattern: Sliding window

package LeetCode;

class Solution {
    public String largestGoodInteger(String num) {
        int i = 0;
        int j = 2;
        int max = -1;
        while (j < num.length()) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(j)) {
                max = Math.max(max, Integer.parseInt(num.substring(i, j + 1)));
                i = j + 1;
                j = i + 2;
            } else {
                i++;
                j++;
            }
        }
        if (max == -1)
            return "";
        else if (max == 0)
            return "000";
        return String.valueOf(max);
    }
}

public class Largest3SameDigitNumInString_2264 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        String num = "6777133339";
        String result = sol.largestGoodInteger(num);
        System.out.println(result);
    }
}

// * Simpler Solution (0ms)

// class Solution {
// public String largestGoodInteger(String num) {
// String[]
// numbers={"999","888","777","666","555","444","333","222","111","000"};
// for(String i:numbers){
// if(num.contains(i)){
// return i;
// }
// }
// return "";

// }
// }