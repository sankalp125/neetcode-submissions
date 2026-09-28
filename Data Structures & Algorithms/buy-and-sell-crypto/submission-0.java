class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int buy = 0;
        int profit = 0;
        for(int i = 0; i < len; i++){
            int diff = prices[i] - prices[buy];
            profit = Math.max(profit, diff);
            if(prices[i]<prices[buy]){
                buy = i;
            }
        }
        return profit;
    }
}
