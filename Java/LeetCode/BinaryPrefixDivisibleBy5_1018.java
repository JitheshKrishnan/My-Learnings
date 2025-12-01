//! Topics: Array, Bit Manipulation

//* Better Solution: 3ms

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int value = 0;
        for(int n : nums){
            value = ((value << 1) + n) % 5;
            result.add(value == 0);
        }
        return result;
    }
}

public class BinaryPrefixDivisibleBy5_1018 {
    public static void main(String[] args) {
        int[] nums = {0,1,1};
        System.out.println(Solution.prefixesDivBy5(nums));
    }
}