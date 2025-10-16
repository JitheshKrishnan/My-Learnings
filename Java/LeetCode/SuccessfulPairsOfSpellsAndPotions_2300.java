//! Topics: Array, Two Pointers, Binary Search, Sorting

//? Medium Difficulty

//* Better Solution: 46ms

import java.util.Arrays;

class Solution {
    public int binarySearchIndex(int[] potions, int mul, long target, int p){
        int l = 0, r = p-1, idx = -1;
        while(l<=r){
            int m = l + (r-l)/2;
            if((long)potions[m]*mul >= target){
                idx = m;
                r = m-1;
            }
            else l = m+1;
        }
        return idx;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int s = spells.length;
        int p = potions.length;
        int idx = 0;
        int[] res = new int[s];
        Arrays.sort(potions);
        for(int i = 0; i < s; i++){
            idx = binarySearchIndex(potions, spells[i], success, p);
            if(idx != -1) res[i] = p-idx;
        }
        return res;
    }
}

public class SuccessfulPairsOfSpellsAndPotions_2300 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        int success = 7;
        int[] result = sol.successfulPairs(spells, potions, success);
        for(int r : result) System.out.print(r + " ");
    }
}