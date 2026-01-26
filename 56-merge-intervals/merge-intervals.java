class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);

        for(int[] interval:intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<interval[0]){
                list.add(interval);
            }
            else{
                list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],interval[1]);
                
            }
        }

        int res[][]=new int[list.size()][];
        int i=0;
        for(var x:list){
            res[i++]=x;

        }

        return res;
    }
}