class Solution {
    public long subArrayRanges(int[] arr) {
        int n=arr.length;
        long sum=0;

        for(int i=0;i<n;i++){
            int max=arr[i];
            int min=arr[i];
            for(int j=i;j<n;j++){
                max=Math.max(max,arr[j]);
                min=Math.min(min,arr[j]);
                sum+=(long)(max-min);
            }
        }


        return sum;
    }
}