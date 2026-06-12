class Solution {


    public int[][] updateMatrix(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int res[][]=new int[rows][cols];
        Queue<int[]> queue=new LinkedList<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==0){
                    res[i][j]=0;
                    queue.add(new int[]{i,j});
                }
                else{
                    res[i][j]=-1;
                }
            }
        }


        while(!queue.isEmpty()){
            int size=queue.size();

            for(int k=0;k<size;k++){
                int poll[]=queue.poll();
                int i=poll[0];
                int j=poll[1];


                if(i+1<rows && res[i+1][j]==-1){
                    queue.add(new int[]{i+1,j});
                    res[i+1][j]=1+res[i][j];
                }
                
                if(i-1>=0 && res[i-1][j]==-1){
                    queue.add(new int[]{i-1,j});
                    res[i-1][j]=1+res[i][j];
                }

                if(j+1<cols && res[i][j+1]==-1){
                    queue.add(new int[]{i,j+1});
                    res[i][j+1]=1+res[i][j];
                }

                if(j-1>=0 && res[i][j-1]==-1){
                    queue.add(new int[]{i,j-1});
                    res[i][j-1]=1+res[i][j];
                }

            
            }
        }


        return res;


        
    }
}