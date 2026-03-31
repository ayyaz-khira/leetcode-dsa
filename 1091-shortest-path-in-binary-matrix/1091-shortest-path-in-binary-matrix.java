class Solution {

    public boolean isSafe(int grid[][],int i,int j,int rows,int cols){
        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j]==1){
            return false;
        }else{
           return true;
        }
    }

    public void modify(Queue queue,int grid[][],int i,int j){
        grid[i][j]=1;
        queue.add(new int[]{i,j});
    }


    public int shortestPathBinaryMatrix(int[][] grid) {
        int levels=1;
        Queue<int[]> queue=new LinkedList<>();
        int cols=grid[0].length;
        int rows=grid.length;

        if(grid[0][0]==1){
            return -1;
        }
        else{
        queue.add(new int[]{0,0});
        grid[0][0]=1;
        }

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int k=0;k<size;k++){
                
                int[] poll=queue.poll();
                int i=poll[0];
                int j=poll[1];

                if(i==rows-1 && j==cols-1) return levels;

                if(isSafe(grid,i+1,j,rows,cols)){
                    modify(queue,grid,i+1,j);
                }
                if(isSafe(grid,i-1,j,rows,cols)){
                    modify(queue,grid,i-1,j);
                }
                if(isSafe(grid,i,j-1,rows,cols)){
                    modify(queue,grid,i,j-1);
                }
                if(isSafe(grid,i,j+1,rows,cols)){
                    modify(queue,grid,i,j+1);
                }

                if(isSafe(grid,i-1,j-1,rows,cols)){
                    modify(queue,grid,i-1,j-1);
                }
                if(isSafe(grid,i+1,j+1,rows,cols)){
                    modify(queue,grid,i+1,j+1);
                }
                if(isSafe(grid,i+1,j-1,rows,cols)){
                    modify(queue,grid,i+1,j-1);
                }
                if(isSafe(grid,i-1,j+1,rows,cols)){
                    modify(queue,grid,i-1,j+1);
                }

                
            }

            levels+=1;
        }

        return -1;
    }
}