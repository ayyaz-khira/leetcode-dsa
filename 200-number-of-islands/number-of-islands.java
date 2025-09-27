class Solution {

    public void dfs(char grid[][],int row,int col,int rows,int cols){
        if(row<0 || row>=rows || col>=cols || col<0 || grid[row][col]=='0'){
            return;
        }

        grid[row][col]='0';
        
        dfs(grid,row+1,col,rows,cols);
        dfs(grid,row-1,col,rows,cols);
        dfs(grid,row,col+1,rows,cols);
        dfs(grid,row,col-1,rows,cols);
    }

    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int count=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,rows,cols);
                    count++;
                }
            }
        }

        return count;
    }
}