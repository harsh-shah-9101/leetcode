class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int right = prices[i + 1];
            int left = prices[i];

            if (right - left > 0) {
                maxprofit += right - left;
            }
        }

        return maxprofit;
    }
}