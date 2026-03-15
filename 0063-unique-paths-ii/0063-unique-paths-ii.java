class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
         if(grid[0][0]==1) return 0;
        int rows=grid.length;
        int cols=grid[0].length;
        

        int dp[][]=new int[rows][cols];
        dp[0][0]=1;
        
        for(int i=1;i<rows;i++){
            if(grid[i][0]==0){
            dp[i][0]=dp[i-1][0];
            }
        }
        
        for(int j=1;j<cols;j++){
            if(grid[0][j]==0){
            dp[0][j]=dp[0][j-1];
            }
        }
        
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(grid[i][j]==1){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[rows-1][cols-1];
    }
}