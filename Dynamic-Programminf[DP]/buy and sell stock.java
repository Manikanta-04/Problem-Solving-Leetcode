public class buy and sell stock {
    
}
class Solution {

    int[][] dp;

    public int maxProfit(int[] prices) {

        int n = prices.length;

        dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(0, 1, prices);
    }

    int solve(int index, int buy, int[] prices) {

        // No more days
        if (index == prices.length) {
            return 0;
        }

        // Already calculated
        if (dp[index][buy] != -1) {
            return dp[index][buy];
        }

        int profit;

        if (buy == 1) {

            // Buy
            int buyStock = -prices[index]
                    + solve(index + 1, 0, prices);

            // Don't buy
            int notBuy = solve(index + 1, 1, prices);

            profit = Math.max(buyStock, notBuy);

        } else {

            // Sell
            int sellStock = prices[index]
                    + solve(index + 1, 1, prices);

            // Don't sell
            int notSell = solve(index + 1, 0, prices);

            profit = Math.max(sellStock, notSell);
        }

        return dp[index][buy] = profit;
    }
}