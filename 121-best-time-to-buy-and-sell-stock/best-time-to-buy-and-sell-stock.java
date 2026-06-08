class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int minPrice=Integer.MAX_VALUE;
        

        for(int price:prices){
            minPrice=Math.min(price,minPrice);
            int profit=price-minPrice;
            maxProfit=Math.max(profit,maxProfit);
        }


        return maxProfit;
    }
}