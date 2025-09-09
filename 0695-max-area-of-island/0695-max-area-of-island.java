class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int rows=grid.length;
        int cols=grid[0].length;
        int area[]={0};
        int max=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    area[0]=0;
                    dfs(grid,i,j,rows,cols,area);
                    max=Math.max(max,area[0]);

                }
                
            }
        }


        return max;
    }

    public void dfs(int grid[][],int i,int j,int rows,int cols,int area[]){
        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j]==0){
            return;
        }
        area[0]+=1;
        grid[i][j]=0;

        dfs(grid,i+1,j,rows,cols,area);
        dfs(grid,i-1,j,rows,cols,area);
        dfs(grid,i,j+1,rows,cols,area);
        dfs(grid,i,j-1,rows,cols,area);
    }
}