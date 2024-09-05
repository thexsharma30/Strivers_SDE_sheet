class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0] , profit=0,cost=0;
        for(int i=1;i<prices.length;i++)
        {
            cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(prices[i],min);
        }
        return profit;
    }
}