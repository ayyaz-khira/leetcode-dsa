class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<n;r++){
            sum+=arr[r];

            while(sum>=target){
                min=Math.min(min,r-l+1);
                sum-=arr[l];
                l++;
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}