//! Topics: HashTable, String Counting

//* My Solution: 5ms

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vowelMap = new HashMap<>();
        Map<Character, Integer> consonantMap = new HashMap<>();
        for(char c : s.toCharArray()){
            switch(c){
                case 'a', 'e', 'i', 'o', 'u':
                    vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
                    break;
                default:
                    consonantMap.put(c, consonantMap.getOrDefault(c, 0) + 1);
                    break;
            }
                
        }
        int vowelFrequency = vowelMap.isEmpty() ? 0 : Collections.max(vowelMap.values()); 
        int consonantFrequency = consonantMap.isEmpty() ? 0 : Collections.max(consonantMap.values()); 
        return vowelFrequency + consonantFrequency;
    }
}

public class MostFreqVowelAndConsonant_3541 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxFreqSum("luffyisstilljoyboy"));
    }
}
