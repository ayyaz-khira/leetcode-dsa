class Solution {

    public void reverse(int arr[]){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }

    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix.length;


        for(int i=0;i<rows;i++){
            for(int j=i+1;j<cols;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<rows;i++){
            reverse(matrix[i]);
        }


    


        
        
    }
}