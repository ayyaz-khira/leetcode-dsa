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

    public void dfs(int mat[][],int row,int col,int rows,int cols,int area[]){
        if(row<0 || row>=rows || col<0 || col>=cols || mat[row][col]==0) return;

        area[0]+=1;

        mat[row][col]=0;

        dfs(mat,row+1,col,rows,cols,area);
        dfs(mat,row-1,col,rows,cols,area);
        dfs(mat,row,col-1,rows,cols,area);
        dfs(mat,row,col+1,rows,cols,area);

    }    
    
}