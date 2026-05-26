class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int scol=0;
        int srow=0;
        int ecol=matrix[0].length-1;
        int erow=matrix.length-1;
        List<Integer> res=new ArrayList<>();


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
            if(srow!=erow){
            for(int j=ecol-1;j>=scol;j--){
                res.add(matrix[erow][j]);
            }
            }


            //left
            if(scol!=ecol){
            for(int i=erow-1;i>=srow+1;i--){
                res.add(matrix[i][scol]);
            }
            }


            scol++;
            srow++;
            erow--;
            ecol--;
        }


        return res;
    }
}