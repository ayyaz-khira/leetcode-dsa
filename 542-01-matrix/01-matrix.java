class Solution {


    public int[][] updateMatrix(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;


        Queue<int[]> queue=new LinkedList<>();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==0){
                    queue.add(new int[]{i,j});
                }
                else{
                    mat[i][j]=-1;
                }
            }
        }


        while(!queue.isEmpty()){
            int size=queue.size();

            for(int k=0;k<size;k++){
                int poll[]=queue.poll();
                int i=poll[0];
                int j=poll[1];

                if(i+1<rows && mat[i+1][j]==-1){
                    queue.add(new int[]{i+1,j});
                    mat[i+1][j]=1+mat[i][j];
                    
                }
                
                if(i-1>=0 && mat[i-1][j]==-1){
                    queue.add(new int[]{i-1,j});
                    mat[i-1][j]=1+mat[i][j];

                }

                if(j+1<cols && mat[i][j+1]==-1){
                    queue.add(new int[]{i,j+1});
                    mat[i][j+1]=1+mat[i][j];
                }

                if(j-1>=0 && mat[i][j-1]==-1){
                    queue.add(new int[]{i,j-1});
                    mat[i][j-1]=1+mat[i][j];
                }


            
            }
        }


        return mat;

        
    }
}