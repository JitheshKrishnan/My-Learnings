//! Topics: Array, Hash Table, String, Sorting

//* My Solution: 3ms

import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        String[] sorted = new String[n];
        List<String> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            sorted[i] = s;
            if(i > 0 && sorted[i-1].equals(sorted[i])) continue;
            result.add(words[i]);
        }
        return result;
    }
}

public class ArrayAfterRemovingAnagrams_2273 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"abba","baba","bbaa","cd","cd"};
        System.out.println(sol.removeAnagrams(words));
    }
}