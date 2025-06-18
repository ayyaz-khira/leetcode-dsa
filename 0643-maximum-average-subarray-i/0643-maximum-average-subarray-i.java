class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        double sum=0;
        double max=0;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
max = sum ;

        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }

        double avg=max/k;
        return avg;
        
    }
}