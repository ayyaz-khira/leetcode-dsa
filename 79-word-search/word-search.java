class Solution {

    public boolean solve(char mat[][],int row,int col,int rows,int cols,String word,int ind){

        if(ind==word.length()) return true;
        if(row<0 || row>=rows || col<0 || col>=cols || mat[row][col]!=word.charAt(ind)) return false;


        char temp=mat[row][col];
        mat[row][col]='#';

        boolean found= solve(mat,row+1,col,rows,cols,word,ind+1) ||
                       solve(mat,row-1,col,rows,cols,word,ind+1) ||
                       solve(mat,row,col+1,rows,cols,word,ind+1) ||
                       solve(mat,row,col-1,rows,cols,word,ind+1);


        mat[row][col]=temp;

        
        return found;

        
        



    }


    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(board,i,j,board.length,board[0].length,word,0)) return true;
                }
            }
        }



        return false;
    }
}