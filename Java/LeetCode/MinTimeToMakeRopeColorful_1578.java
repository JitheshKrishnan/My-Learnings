//! Topics: Array, String, Dynamic Programming, Greedy

//? Medium Difficulty

//* My Solution: 9ms

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int result = 0;
        for(int i = 1; i < colors.length(); i++){
            if(colors.charAt(i) == colors.charAt(i-1)){
                result += Math.min(neededTime[i], neededTime[i-1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
            }
        }
        return result;
    }
}

public class MinTimeToMakeRopeColorful_1578 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String colors = "abaac";
        int[] neededTime = {1,2,3,4,5};
        System.out.println(sol.minCost(colors, neededTime));
    }
}
