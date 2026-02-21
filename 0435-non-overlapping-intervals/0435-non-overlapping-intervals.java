class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count=1;

        int prev=intervals[0][1];
        for(int i=1;i<n;i++){
            if(prev<=intervals[i][0]){
                count++;
                prev=intervals[i][1];
            }
        }


        return n-count;

    }
}