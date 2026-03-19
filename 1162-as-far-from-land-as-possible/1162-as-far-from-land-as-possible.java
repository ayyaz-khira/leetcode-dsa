class Solution {

    public boolean isSafe(int grid[][],int i,int j,int rows,int cols){
        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j]==1) {
            return false;
        }

        grid[i][j]=1;
        return true;
    }
    

    public int maxDistance(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int count=0;
        int countOnes=0;

        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    queue.add(new int[]{i,j});
                    countOnes+=1;
                }
            }
        }

        if(countOnes==0 || countOnes==(rows*cols)) return -1;


        while(!queue.isEmpty()){
            int size=queue.size();

            for(int k=0;k<size;k++){
                int poll[]=queue.poll();
                int i=poll[0];
                int j=poll[1];

                if(isSafe(grid,i+1,j,rows,cols)){
                    queue.add(new int[]{i+1,j});
                }
                if(isSafe(grid,i-1,j,rows,cols)){
                    queue.add(new int[]{i-1,j});
                }
                if(isSafe(grid,i,j+1,rows,cols)){
                    queue.add(new int[]{i,j+1});
                }
                if(isSafe(grid,i,j-1,rows,cols)){
                    queue.add(new int[]{i,j-1});
                }
            }

            count++;

            
        }


        return count-1;
        
    }
}