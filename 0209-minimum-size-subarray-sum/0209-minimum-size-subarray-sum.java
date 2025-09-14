class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int l=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=arr[r];
            while(sum>=target){
                min=Math.min(r-l+1,min);
                sum-=arr[l];
                l++;
            }
        }


        return min==Integer.MAX_VALUE?0:min;
    }
}