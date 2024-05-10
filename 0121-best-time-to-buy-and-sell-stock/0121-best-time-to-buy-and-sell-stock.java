class Solution {
    public int maxProfit(int[] prices) {
        int profitMin = Integer.MAX_VALUE;
        int profitMax = 0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]<profitMin){
                profitMin = prices[i];
            }
            else if((prices[i] - profitMin)>profitMax){
                profitMax = prices[i] - profitMin;
            }
        }
        return profitMax;
    }
}