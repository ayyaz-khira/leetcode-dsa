class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int rows=grid.length;
        int cols=grid[0].length;
        int fresh=0;
        int rotten=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                    
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0) return 0;

        int count=0;

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int k=0;k<size;k++){
                
                int poll[]=queue.poll();
                int i=poll[0];
                int j=poll[1];

                if(i+1<rows && grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    queue.add(new int[]{i+1,j});
                    fresh--;
                }

                if(i-1>=0 && grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    queue.add(new int[]{i-1,j});
                    fresh--;

                }

                if(j+1<cols && grid[i][j+1]==1){
                    grid[i][j+1]=2;
                    queue.add(new int[]{i,j+1});
                    fresh--;
                }

                if(j-1>=0 && grid[i][j-1]==1){
                    grid[i][j-1]=2;
                    queue.add(new int[]{i,j-1});
                    fresh--;
                }
            }

            count++;
        }
        

        return fresh==0? count-1 : -1;
    }
}