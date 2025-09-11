//! Topics: String, Sorting

//? Medium Difficulty

//* My Solution: 42ms

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String sortVowels(String s) {
        char[] l = new char[s.length()];
        List<Character> vowels = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                vowels.add(s.charAt(i));
                l[i] = '#';
                continue;
            }
            l[i] = s.charAt(i);
        }
        Collections.sort(vowels);
        for(int i = 0, j = 0; i < l.length && j < vowels.size(); i++){
            if(l[i] == '#'){
                l[i] = vowels.get(j);
                j++;
            }
        }
        return new String(l);
    }
}

public class SortVowelsInString_2785 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.sortVowels("JiThEsH"));
    }
}
