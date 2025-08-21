class Solution {

    public boolean find(char mat[][],int row,int col,int rows,int cols,int ind,String word){
        if(ind==word.length()) return true;

        if(row<0 || row>=rows || col<0 || col>=cols || word.charAt(ind)=='#' || word.charAt(ind)!=mat[row][col]) return false;

        char temp=mat[row][col];
        mat[row][col]='#';

        boolean found=find(mat,row+1,col,rows,cols,ind+1,word) ||
                      find(mat,row-1,col,rows,cols,ind+1,word) ||
                      find(mat,row,col+1,rows,cols,ind+1,word) ||
                      find(mat,row,col-1,rows,cols,ind+1,word);

        mat[row][col]=temp;

        return found;

            
    }



    public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int cols=board[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(word.charAt(0)==board[i][j]){
                    if(find(board,i,j,rows,cols,0,word)) return true;
                }
            }
        }



        return false;
    }
}