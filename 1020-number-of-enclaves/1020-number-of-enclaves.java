class Solution {

    public int dfs(int grid[][],int i,int j,int rows,int cols){
        if(i<0 || j<0 || i>=rows || j>=cols || grid[i][j]==0) return 0;

        int count=0;

        grid[i][j]=0;
        count+=1;

        count+=dfs(grid,i+1,j,rows,cols);
        count+=dfs(grid,i-1,j,rows,cols);
        count+=dfs(grid,i,j+1,rows,cols);
        count+=dfs(grid,i,j-1,rows,cols);


        return count;
       
    }

    public int numEnclaves(int[][] grid) {
        int count=0;
        int rows=grid.length;
        int cols=grid[0].length;
        int ones=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1) ones++;
            }
        }


        for(int i=0;i<rows;i++){
            count+=dfs(grid,i,0,rows,cols);
        }

        for(int j=0;j<cols;j++){
            count+=dfs(grid,0,j,rows,cols);
        }

        for(int i=0;i<rows;i++){
            count+=dfs(grid,i,cols-1,rows,cols);
        }
        for(int j=0;j<cols;j++){
            count+=dfs(grid,rows-1,j,rows,cols);
        }


        return ones-count;


    }
}