//! Topics: Array, Prefix Sum

//? Medium Difficulty

//* Better Solution: 2ms

class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length, max = Integer.MIN_VALUE;
        for(int i = n-k; i < n; i++){
            for(int j = i, sum = 0; j >= 0; j -= k){
                sum += energy[j];
                if(sum > max) max = sum;
            }
        }
        return max;
    }
}

public class MaxEnergyFromMysticDungeon_3147 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] energy = {5,2,-10,-5,1};
        int k = 3;
        System.out.println(sol.maximumEnergy(energy, k));
    }   
}
