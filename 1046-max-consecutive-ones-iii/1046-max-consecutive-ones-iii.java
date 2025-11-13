class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
        int max=0;
        int numZeroes=0;
        int l=0;

        for(int r=0;r<n;r++){
            if(arr[r]==0){
                numZeroes++;
            }

            while(numZeroes>k){
                if(arr[l]==0){
                    numZeroes--;
                }
                l++;
            }

            max=Math.max(max,r-l+1);
        }


        return max;
    }
}