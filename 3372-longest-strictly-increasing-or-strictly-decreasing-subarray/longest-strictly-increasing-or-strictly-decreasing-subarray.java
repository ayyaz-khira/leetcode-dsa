class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int n=arr.length;
        int incMax=1;
        int decMax=1;
        int incLong=1;
        int decLong=1;
        if(n==0) return 0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                incLong++;
                decLong=1;
            }
            else if(arr[i+1]<arr[i]){
                incLong=1;
                decLong++;
            }
            else{
                incLong=decLong=1;
            }
            

            incMax=Math.max(incMax,incLong);
            decMax=Math.max(decMax,decLong);


        }

        return Math.max(incMax,decMax);
    }
}