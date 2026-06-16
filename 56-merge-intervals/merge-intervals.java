class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    
        List<int[]> list=new ArrayList<>();

        for(int interval[]:intervals){
            if(list.isEmpty() || interval[0]>list.get(list.size()-1)[1]){
                list.add(interval);
            }
            else{
                list.get(list.size()-1)[1]=Math.max(interval[1],list.get(list.size()-1)[1]);
            }
        }

        int res[][]=new int[list.size()][];
        int i=0;
        for(int x[]:list){
            res[i++]=x;
        }


        return res;
    }
}