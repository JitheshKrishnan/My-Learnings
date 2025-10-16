import java.util.*;

public class MagicalSequences {
    static final long MOD = 1_000_000_007L;
    static Map<String, Long> memo = new HashMap<>();

    static int bitcount(long x) {
        return Long.bitCount(x);
    }

    static long dfs(int idx, int used, long mask, int m, int k, int[] nums, long prod) {
        if (used > m) return 0;
        if (idx == nums.length) {
            if (used == m && bitcount(mask) == k)
                return prod % MOD;
            return 0;
        }

        String key = idx + "," + used + "," + mask;
        if (memo.containsKey(key)) return memo.get(key);

        long sum = 0;
        for (int cnt = 0; cnt <= m - used; cnt++) {
            long newMask = mask + ((1L << idx) * cnt);
            long newProd = prod;
            for (int t = 0; t < cnt; t++)
                newProd = (newProd * nums[idx]) % MOD;
            sum = (sum + dfs(idx + 1, used + cnt, newMask, m, k, nums, newProd)) % MOD;
        }

        memo.put(key, sum);
        return sum;
    }

    public static long magicalSum(int m, int k, int[] nums) {
        memo.clear();
        return dfs(0, 0, 0, m, k, nums, 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 10, 100, 10000, 1000000};

        System.out.println(magicalSum(5, 5, nums)); // 991600007
        System.out.println(magicalSum(5, 4, nums)); // smaller value
        System.out.println(magicalSum(1, 1, new int[]{28})); // 28
    }
}