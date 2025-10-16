//! Topics: Arrays, Dynamic Programming

//? Medium Difficulty

//* My Solution: 9ms

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size() - 2; i >= 0; i--){
            for(int j = 0; j < triangle.get(i).size(); j++){
                int a = triangle.get(i+1).get(j);
                int b = triangle.get(i+1).get(j+1);
                int c = triangle.get(i).get(j);
                triangle.get(i).set(j, Math.min(a+c, b+c));
            }
        }
        return triangle.get(0).get(0);
    }
}

public class Triangle_120{
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        System.out.println(sol.minimumTotal(triangle));
    }
}