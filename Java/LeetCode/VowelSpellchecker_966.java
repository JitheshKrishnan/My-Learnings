//! Topics: Arrays, Hash Table, String

//? Medium Difficulty

//* Better Solution: 52ms (But not the best)

import java.util.*;

class Solution {
    // Helper function: normalize vowels
    public String normalizeVowels(String word) {
        return word.toLowerCase().replaceAll("[aeiou]", "*");
    }
    
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactMatchSet = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitiveMap = new HashMap<>();
        Map<String, String> vowelInsensitiveMap = new HashMap<>();

        // Build maps
        for (String word : wordlist) {
            String lower = word.toLowerCase();
            caseInsensitiveMap.putIfAbsent(lower, word);
            vowelInsensitiveMap.putIfAbsent(normalizeVowels(lower), word);
        }

        String[] results = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (exactMatchSet.contains(query)) {
                results[i] = query;
                continue;
            }

            String lowerQuery = query.toLowerCase();
            if (caseInsensitiveMap.containsKey(lowerQuery)) {
                results[i] = caseInsensitiveMap.get(lowerQuery);
                continue;
            }

            String vowelNormalized = normalizeVowels(lowerQuery);
            if (vowelInsensitiveMap.containsKey(vowelNormalized)) {
                results[i] = vowelInsensitiveMap.get(vowelNormalized);
                continue;
            }

            results[i] = "";
        }
        return results;
    }
}

public class VowelSpellchecker_966 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] wordList = {"KiTe","kite","hare","Hare"};
        String[] queries = {"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"};
        String[] resultStrings = sol.spellchecker(wordList, queries);
        for(String s : resultStrings)
            System.out.print(s + ", ");
    }
}