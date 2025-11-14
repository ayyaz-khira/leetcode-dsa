class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int srow=0;
        int scol=0;
        int ecol=n-1;
        int erow=m-1;

        while(srow<=erow && scol<=ecol){

            //top
            for(int j=scol;j<=ecol;j++){
                res.add(matrix[srow][j]);
            }

            //right
            for(int i=srow+1;i<=erow;i++){
                res.add(matrix[i][ecol]);
            }

            //bottom
            if(srow==erow){
                break;
            }else{
            for(int j=ecol-1;j>=scol;j--){
                res.add(matrix[erow][j]);
            }
            }

            //left
            if(scol==ecol){
                break;
            }
            else{
            for(int i=erow-1;i>=srow+1;i--){
                res.add(matrix[i][scol]);
            }
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }


        return res;
        
        
    }
}