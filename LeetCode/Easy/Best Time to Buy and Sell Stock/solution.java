class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minprice =  prices[0];

        for(int i=1;i<prices.length;i++){
            int profit = prices[i]-minprice;

            if(profit>maxProfit){
                maxProfit = profit;
            }

            if(prices[i]<minprice){
                minprice = prices[i];
            }
        }
        return maxProfit;
    }
}