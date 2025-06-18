class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int coin:coins){
            for(int i=0;i<=amount;i++){
                if(i>=coin){
                    if(dp[i-coin]!=Integer.MAX_VALUE){
                        dp[i]=Math.min(dp[i],dp[i-coin]+1);
                    }
                }
            }
        }

        if(dp[amount]==Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];

        
        
    }
}