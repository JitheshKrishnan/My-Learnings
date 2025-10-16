//! Topics: Hash Table String


//* My Solution: 4ms

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = words.length;
        for(String s : words){
            for(char c : brokenLetters.toCharArray()){
                if(s.contains(String.valueOf(c))){
                    count--;
                    break;
                }
            }
        }
        return count < 0 ? 0 : count;
    }
}

public class MaxNumOfWordsYouCanType_1935 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.canBeTypedWords("luffy is still joyboy", "ncuh"));
    }
}
