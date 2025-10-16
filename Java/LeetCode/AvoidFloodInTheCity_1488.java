//! Topics: Array, Hash Table, Binary Search, Greedy, Heap (Priority Queue)

//? Medium Difficulty

//* Better Solution: 66ms

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

class Solution {
    public int[] avoidFlood(int[] rains) {
        
        int n = rains.length;
        int[] result = new int[n];
        Map<Integer, Integer> fullLakes = new HashMap<>();
        NavigableSet<Integer> dryDays = new TreeSet<>();

        for(int i = 0; i < n; i++){

            int lake = rains[i];

            if(lake == 0){
                dryDays.add(i);
                result[i] = 1;
            }

            else{

                result[i] = -1; 
                if(fullLakes.containsKey(lake)){

                    int lastRainDay = fullLakes.get(lake);
                    Integer dryDayIdx = dryDays.higher(lastRainDay);

                    if(dryDayIdx == null) return new int[0];

                    result[dryDayIdx] = lake;
                    dryDays.remove(dryDayIdx);
                }

                fullLakes.put(lake, i);
            }
        }

        return result;
    }
}

public class AvoidFloodInTheCity_1488 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] rains = {1,2,0,0,2,1};
        int[] res = sol.avoidFlood(rains);
        for(int r : res)
            System.out.print(r+" ");
    }
}