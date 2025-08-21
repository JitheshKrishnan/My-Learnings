// ! Topic: Arrays

// ? Medium Difficulty

package LeetCode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<Integer> sol = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, sol, res);
        return res;
    }

    public void backtrack(int[] nums, List<Integer> sol, List<List<Integer>> res) {
        if (sol.size() == nums.length) {
            res.add(new ArrayList<>(sol));
            return;
        }

        for (int i : nums) {
            if (!sol.contains(i)) {
                sol.add(i);
                backtrack(nums, sol, res);
                sol.remove(sol.size() - 1);
            }
        }
    }
}

public class Permutations_46 {
    public static void main(String[] a) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3 };
        System.out.println(solution.permute(nums));
    }
}