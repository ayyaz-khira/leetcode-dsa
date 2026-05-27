class Solution {

    public boolean found(char mat[][], int row, int col, int rows, int cols, String word, int ind){
        if(word.length()==ind) return true;

        if(row<0 || row>=rows || col<0 || col>=cols || mat[row][col]=='#' || mat[row][col]!=word.charAt(ind)){
            return false;
        }

        char temp=mat[row][col];
        mat[row][col]='#';

        boolean isFound= found(mat, row+1, col, rows, cols, word, ind+1)
                    ||   found(mat, row-1, col, rows, cols, word, ind+1)
                    ||   found(mat, row, col+1, rows, cols, word, ind+1)
                    ||   found(mat, row, col-1, rows, cols, word, ind+1);

        mat[row][col]=temp;
        
        
        return isFound;


        
    }


    public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int cols=board[0].length;
        boolean vis[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(word.charAt(0)==board[i][j]){
                    if(found(board,i,j,rows,cols,word,0)) return true;
                }
            }
        }


        return false;
    }
}