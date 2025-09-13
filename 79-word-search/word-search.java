class Solution {
    public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int cols=board[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(board,i,j,rows,cols,word,0)) return true;
                }
            }
        }


        return false;

    }

    public boolean solve(char mat[][],int row,int col,int rows,int cols,String word,int ind){
        if(ind==word.length()) return true;

        if(row<0 || row>=rows || col<0 || col>=cols || mat[row][col]=='#' || mat[row][col]!=word.charAt(ind)) return false;

        char temp=mat[row][col];
        mat[row][col]='#';

        boolean found=solve(mat,row+1,col,rows,cols,word,ind+1) ||
                      solve(mat,row-1,col,rows,cols,word,ind+1) ||
                      solve(mat,row,col+1,rows,cols,word,ind+1) ||
                      solve(mat,row,col-1,rows,cols,word,ind+1);

        mat[row][col]=temp;

        return found;

    }
}