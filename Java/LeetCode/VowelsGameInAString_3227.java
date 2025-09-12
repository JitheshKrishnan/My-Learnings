//! Topics: String, Math, Brainteaser, Game Theory

// ? Medium Difficulty

//* My Solution: 8ms

class Solution {
    public boolean doesAliceWin(String s) {
        int len  = s.length();
        int startIndex = 0;
        boolean alice = true;
        char[] chars = s.toCharArray();
        while(true){
            if(alice){
                int vowels = 0;
                for(int i = startIndex; i < len; i++){
                    if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'){
                        vowels++;
                    }
                    if(vowels%2 == 1) startIndex = i+1;
                }
                if(vowels == 0) return false;
            }
            else{
                int vowels = 0;
                int letters = 0;
                for(int i = startIndex; i < len; i++){
                    if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u')
                        vowels++;
                    if(vowels%2 == 1) continue;
                    startIndex = i+1;
                    letters++;
                }
                if(letters == 0) return true;
            }
            alice = !alice;
        }
    }
}

public class VowelsGameInAString_3227 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.doesAliceWin("ee"));
    }
}

//* Better Simple Solution: 7ms
// class Solution {
//     public boolean doesAliceWin(String s) {
//         int vowels = 0;
//         for (char c : s.toCharArray()) {
//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
//         }
//         return vowels != 0;
//     }
// }

//* Best Solution: 2ms
// class Solution {
//     public boolean doesAliceWin(String s) {
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             switch (c) {
//                 case 'a','e','i','o','u':
//                     return true;
//             }
//         }

//         return false;
//     }
// }