class Solution {

    public void perform(Queue queue,int grid[][], int i, int j, int rows, int cols){
        if(i>=0 && i<rows && j>=0 && j<cols && grid[i][j]==0){
            queue.add(new int[]{i,j});
            grid[i][j]=1;
        }
    }



    public int shortestPathBinaryMatrix(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        if(grid[0][0]==1) return -1;

        Queue<int[]> queue=new LinkedList<>();

        queue.add(new int[]{0,0});

        int level=1;

        while(!queue.isEmpty()){
            int size=queue.size();

            

            for(int k=0;k<size;k++){
                
                int res[]=queue.poll();
                int i=res[0];
                int j=res[1];

                if(i==rows-1 && j==cols-1) return level;

                perform(queue,grid,i+1,j,rows,cols);
                perform(queue,grid,i-1,j,rows,cols);
                perform(queue,grid,i,j+1,rows,cols);
                perform(queue,grid,i,j-1,rows,cols);
                perform(queue,grid,i+1,j+1,rows,cols);
                perform(queue,grid,i-1,j-1,rows,cols);
                perform(queue,grid,i+1,j-1,rows,cols);
                perform(queue,grid,i-1,j+1,rows,cols);


            }

            level++;

        }


        return -1;
    }
}