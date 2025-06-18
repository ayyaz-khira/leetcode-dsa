class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][]=new int[n+1][target+1];
        int MOD=1000000007;
        dp[0][0]=1;

        for(int dice=1;dice<=n;dice++){
            for(int sum=1;sum<=target;sum++){
                for(int face=1;face<=k;face++){
                    if(sum-face>=0){
                        dp[dice][sum]=(dp[dice][sum]+dp[dice-1][sum-face])%MOD;
                    }
                }
            }
        }
        

        return dp[n][target];
    }
}