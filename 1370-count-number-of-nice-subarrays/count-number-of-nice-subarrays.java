class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
                return atMostK(arr,k)-atMostK(arr,k-1);

    }

    public int atMostK(int arr[], int k){

        int n=arr.length;
        int count=0;
        int odd=0;
        
        int l=0;

        for(int r=0;r<n;r++){
            if(arr[r]%2!=0){
                odd++;
            }


            while(odd>k){
                if(arr[l]%2!=0){
                    odd--;
                }
                l++;
            }

            count+=r-l;
        }


        return count;
    }
}