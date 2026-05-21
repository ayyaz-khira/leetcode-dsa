class Solution {

    public void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public void sortColors(int[] arr) {
        int l=0;
        int mid=0;
        int n=arr.length;
        int r=n-1;


        while(mid<=r){
            if(arr[mid]==0){
                swap(arr,l,mid);
                mid++;
                l++;
                
            }
            else if(arr[mid]==1){
                mid++;
                

            }
            else{
                swap(arr,mid,r);
                r--;
            }
        }



    }
}