class Solution {

    public boolean isSafe(int i,int j,int rows,int cols,int grid[][]){
        if(i>=0 && i<rows && j>=0 && j<cols && grid[i][j]==0){ return true;}
        return false;
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        int count=1;

        int rows=grid.length;
        int cols=grid[0].length;

        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0});
        grid[0][0]=1;

        while(!queue.isEmpty()){

            int size=queue.size();
            for(int k=0;k<size;k++){
            int cell[]=queue.poll();
            int i=cell[0];
            int j=cell[1];
            
            if(i==rows-1 && j==cols-1) return count;
            if(isSafe(i+1,j,rows,cols,grid)) { queue.add(new int[]{i+1,j}); grid[i+1][j]=1;}
            if(isSafe(i-1,j,rows,cols,grid)) {queue.add(new int[]{i-1,j});grid[i-1][j]=1;}
            if(isSafe(i+1,j+1,rows,cols,grid)) {queue.add(new int[]{i+1,j+1});grid[i+1][j+1]=1;}
            if(isSafe(i+1,j-1,rows,cols,grid)) {queue.add(new int[]{i+1,j-1});grid[i+1][j-1]=1;}
            if(isSafe(i-1,j+1,rows,cols,grid)){ queue.add(new int[]{i-1,j+1});grid[i-1][j+1]=1;}
            if(isSafe(i,j-1,rows,cols,grid)) {queue.add(new int[]{i,j-1});grid[i][j-1]=1;}
            if(isSafe(i-1,j-1,rows,cols,grid)){ queue.add(new int[]{i-1,j-1});grid[i-1][j-1]=1;}
            if(isSafe(i,j+1,rows,cols,grid)) {queue.add(new int[]{i,j+1});grid[i][j+1]=1;}


            }

            count+=1;

            
        }

        return -1;

    }
}