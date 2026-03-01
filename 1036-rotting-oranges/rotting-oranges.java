class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int rows=grid.length;
        int cols=grid[0].length;
        int totalOranges=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    totalOranges+=1;
                }
            }
        }

        int count=0;
        while(!queue.isEmpty() && totalOranges>0){
            int size=queue.size();

            for(int i=0;i<size;i++){
            int rot[]=queue.poll();
            grid[rot[0]][rot[1]]=2;

            if(rot[0]-1>=0 && grid[rot[0]-1][rot[1]]==1) {queue.offer(new int[]{rot[0]-1,rot[1]}); totalOranges-=1; grid[rot[0]-1][rot[1]]=2;}
            if(rot[1]-1>=0 && grid[rot[0]][rot[1]-1]==1) {queue.offer(new int[]{rot[0],rot[1]-1}); totalOranges-=1; grid[rot[0]][rot[1]-1]=2;}
            if(rot[0]+1<rows && grid[rot[0]+1][rot[1]]==1) {queue.offer(new int[]{rot[0]+1,rot[1]}); totalOranges-=1; grid[rot[0]+1][rot[1]]=2;}
            if(rot[1]+1<cols && grid[rot[0]][rot[1]+1]==1) {queue.offer(new int[]{rot[0],rot[1]+1}); totalOranges-=1; grid[rot[0]][rot[1]+1]=2; }

            }
            count++;

        }


        return totalOranges == 0 ? count : -1;

    

    }
}