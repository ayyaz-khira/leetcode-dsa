class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        List<Integer> res=new ArrayList<>();

        int srow=0;
        int erow=rows-1;
        int scol=0;
        int ecol=cols-1;


        while(srow<=erow && scol<=ecol){

            //top
            for(int j=scol;j<=ecol;j++){
                res.add(matrix[srow][j]);
            }


            //right
            for(int i=srow+1;i<=erow;i++){
                res.add(matrix[i][ecol]);
            }

            if(srow==erow){
                break;
            }else{
            //bottom
            for(int j=ecol-1;j>=scol;j--){
                res.add(matrix[erow][j]);
            }
            }


            if(scol==ecol){
                break;
            }else{

            //left
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