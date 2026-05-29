class Solution {

    public void dfs(int grid[][], int rows, int cols, int row, int col){
        if(row<0 || row>=rows || col<0 || col>=cols || grid[row][col]==0) return;

        grid[row][col]=0;

        dfs(grid, rows, cols, row+1, col);
        dfs(grid, rows, cols, row-1, col);
        dfs(grid, rows, cols, row, col+1);
        dfs(grid, rows, cols, row, col-1);

    }




    public int numEnclaves(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        int land=0;


        for(int i=0;i<rows;i++){
            dfs(grid,rows,cols,i,0);
            dfs(grid,rows,cols,i,cols-1);

        }

        for(int j=0;j<cols;j++){
            dfs(grid,rows,cols,0,j);
            dfs(grid,rows,cols,rows-1,j);
        }


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    land++;
                }
            }
        }


        return land;



    }
}