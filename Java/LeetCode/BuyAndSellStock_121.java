package LeetCode;

class BuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 1;
        int buy = prices[0];

        while (i < prices.length) {
            if (buy > prices[i])
                buy = prices[i];
            else if (profit < prices[i] - buy)
                profit = prices[i] - buy;
            i++;
        }
        return profit;
    }
}