//! Topics: Array, Simulation, Prefix Sum

//? Medium Difficulty

//* My Solution: 199ms

class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = mana.length;
        int m = skill.length+1;
        long[][] time = new long[n][m];
        for(int i = 1; i < m; i++){
            time[0][i] = time[0][i-1] + skill[i-1] * mana[0];
        }
        long addTime = 0;
        long currTime = 0;
        long maxTime = 0;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m-1; j++){
                currTime = time[i][j];
                maxTime = time[i-1][j+1];
                if(currTime < maxTime) {
                    addTime += (maxTime - currTime);
                    time[i][j] = maxTime;
                }
                time[i][j+1] = time[i][j] + (skill[j] * mana[i]);
            }
            time[i][0] = addTime;
            for(int j = 1; j < m; j++){
                time[i][j] = time[i][j-1] + (skill[j-1] * mana[i]);
            }
            addTime = 0;
        }
        return time[n-1][m-1];
    }
}

public class MinTimeToBrewPotions_3494 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] skill = {1,5,2,4};
        int[] mana = {5,1,4,2};
        System.out.println(sol.minTime(skill, mana));
    }
}

//* Better Solution: 196ms

// class Solution {
//     public long minTime(int[] skill, int[] mana) {
//         int n = skill.length;
//         long[] time = new long[n];

//         for (int x : mana) {
//             time[0] = time[0] + 1L * skill[0] * x;
//             for (int i = 1; i < n; i++) {
//                 time[i] = Math.max(time[i], time[i - 1]) + 1L * skill[i] * x;
//             }
//             for (int i = n - 2; i >= 0; i--) {
//                 time[i] = time[i + 1] - 1L * skill[i + 1] * x;
//             }
//         }
//         return time[n - 1];
//     }
// }