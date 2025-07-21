class Solution {

    public void dfs(char mat[][],int row,int col,int rows,int cols){
        if(row<0 || row>=rows || col<0 || col>=cols || mat[row][col]=='0') return;

        mat[row][col]='0';

        dfs(mat,row+1,col,rows,cols);
        dfs(mat,row-1,col,rows,cols);
        dfs(mat,row,col+1,rows,cols);
        dfs(mat,row,col-1,rows,cols);
    }


    public int numIslands(char[][] grid) {
        int islands=0;
        int rows=grid.length;
        int cols=grid[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,rows,cols);
                    islands++;
                }
            }
        }


        return islands;
    }
}