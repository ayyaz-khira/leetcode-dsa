class Solution {

    public boolean solve(char board[][],int row,int col,int rows,int cols,String word,int ind){
        if(ind==word.length()) return true;

        if(row<0 || row>=rows || col<0 || col>=cols || board[row][col]=='#' || board[row][col]!=word.charAt(ind)) return false;

        char temp=board[row][col];
        board[row][col]='#';

        boolean found=solve(board,row+1,col,rows,cols,word,ind+1) ||
                      solve(board,row-1,col,rows,cols,word,ind+1) ||
                      solve(board,row,col+1,rows,cols,word,ind+1) ||
                      solve(board,row,col-1,rows,cols,word,ind+1);

        
        board[row][col]=temp;

        return found;
    }

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
}