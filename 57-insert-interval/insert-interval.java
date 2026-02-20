class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();

        int i=0;
        int n=intervals.length;

        while(i<n && intervals[i][1]<newInterval[0]){
            list.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }

        list.add(newInterval);

        while(i<n){
            list.add(intervals[i]);
            i++;
        }

        int res[][]=new int[list.size()][];
        int j=0;
        for(int x[]:list){
            res[j++]=x;
        }

        return res;


    }
}