import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int smallest =prices[0];
        for (int i =1;i<prices.length;i++){
            if(maxProfit< prices[i]-smallest){
                    maxProfit=  prices[i]-smallest;
                }
            if(prices[i]<smallest){
                    smallest =prices[i];
                }
        }
        return maxProfit;
    }
}