// ! Topic: Backtracking

// ? Hard Difficulty

package LeetCode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    final double EPS = 1e-6;

    public boolean judgePoint24(int[] cards) {
        List<Double> nums = new ArrayList<>();
        for (int n : cards)
            nums.add((double) n);
        return dfs(nums);
    }

    private boolean dfs(List<Double> nums) {
        if (nums.size() == 1) {
            return Math.abs(nums.get(0) - 24.0) < EPS;
        }
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i == j)
                    continue;
                List<Double> next = new ArrayList<>();
                for (int k = 0; k < nums.size(); k++) {
                    if (k != i && k != j)
                        next.add(nums.get(k));
                }
                for (double val : compute(nums.get(i), nums.get(j))) {
                    next.add(val);
                    if (dfs(next))
                        return true;
                    next.remove(next.size() - 1);
                }
            }
        }
        return false;
    }

    private List<Double> compute(double a, double b) {
        List<Double> res = new ArrayList<>();
        res.add(a + b);
        res.add(a - b);
        res.add(b - a);
        res.add(a * b);
        if (Math.abs(b) > EPS)
            res.add(a / b);
        if (Math.abs(a) > EPS)
            res.add(b / a);
        return res;
    }
}

public class Game24_679 {
    public static void main(String[] a) {
        Solution sol = new Solution();
        int[] nums = { 1, 4, 6, 1 };
        System.out.println(sol.judgePoint24(nums));
    }
}

// * My Solution: Brute Force Approach! (Did not pass the test case {1,4,6,1})
// * Output = false, Expected = true

// class Solution {
// public boolean judgePoint24(int[] cards) {
// List<List<Integer>> cardsList = permutationList(cards);
// for(List<Integer> perm : cardsList){
// double a = perm.get(0);
// double b = perm.get(1);
// double c = perm.get(2);
// double d = perm.get(3);
// if(isValid(a+b, c, d) || isValid(a-b, c, d) || isValid(a*b, c, d) ||
// isValid(a/b, c, d)) return true;
// if(isValid(a, b+c, d) || isValid(a, b-c, d) || isValid(a, b*c, d) ||
// isValid(a, b/c, d)) return true;
// if(isValid(a, b, c+d) || isValid(a, b, c-d) || isValid(a, b, c*d) ||
// isValid(a, b, c/d)) return true;
// }
// return false;
// }
// public List<List<Integer>> permutationList(int[] cards){
// List<Integer> sol = new ArrayList<>();
// List<List<Integer>> res = new ArrayList<>();
// backtrack(res, sol, cards);
// return res;
// }
// public void backtrack(List<List<Integer>> res, List<Integer> sol, int[]
// cards){
// if(sol.size() == cards.length){
// res.add(new ArrayList<>(sol));
// return;
// }
// for(int i : cards){
// if(!sol.contains(i)){
// sol.add(i);
// backtrack(res, sol, cards);
// sol.remove(sol.size()-1);
// }
// }
// }
// public boolean isValid(double a, double b, double c){
// if(isValid(a+b, c) || isValid(a-b, c) || isValid(a*b, c) || Math.abs(b) >
// 1e-6 && isValid(a/b, c)) return true;
// if(isValid(a, b+c) || isValid(a, b-c) || isValid(a, b*c) || Math.abs(c) >
// 1e-6 && isValid(a, b/c)) return true;
// return false;
// }
// public boolean isValid(double a, double b){
// if(Math.abs(a+b-24) < 1e-6 || Math.abs(a-b-24) < 1e-6 || Math.abs(a*b-24) <
// 1e-6 || Math.abs(b) > 1e-6 && Math.abs(a/b-24) <= 1e-6) return true;
// return false;
// }
// }