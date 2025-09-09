//! Topic: Math

class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(z-x);
        int b = Math.abs(z-y);
        if(a < b)
            return 1;
        else if(b < a)
            return 2;
        else
            return 0;
    }
}

public class FindClosestPerson_3516 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findClosest(2, 7, 4));
    }
}
