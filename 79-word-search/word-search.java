class Solution {

    public boolean isSafe(char mat[][],int i,int j,int rows,int cols,String word,int ind){
        if(ind==word.length()) return true;


        if(i<0 || i>=rows || j<0 || j>=cols || mat[i][j]=='#' || word.charAt(ind)!=mat[i][j]) return false;

        char temp=mat[i][j];

        mat[i][j]='#';

        boolean found=isSafe(mat,i+1,j,rows,cols,word,ind+1) ||
        isSafe(mat,i-1,j,rows,cols,word,ind+1) ||
        isSafe(mat,i,j+1,rows,cols,word,ind+1) ||
        isSafe(mat,i,j-1,rows,cols,word,ind+1);

        mat[i][j]=temp;

        return found;



    }






    public boolean exist(char[][] board, String word) {

        int rows=board.length;
        int cols=board[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if(board[i][j]==word.charAt(0)){
                if(isSafe(board,i,j,rows,cols,word,0)){
                    return true;
                }
               }
            }
        }


        return false;
    }
}