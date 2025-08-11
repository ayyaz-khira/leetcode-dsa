class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new SortIntervals());
        List<int[]> res=new ArrayList<>();
        for(int[] interval:intervals){
            if(res.isEmpty() || res.get(res.size()-1)[1]<interval[0]){
                res.add(interval);
            }
            else{
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],interval[1]);
            }
        }

        int list[][]=new int[res.size()][];
        int i=0;
        for(int[] interval:res){
            list[i++]=interval;
        }

        return list;
        
    }
}


class SortIntervals implements Comparator<int[]>{
    @Override
    public int compare(int arr1[],int arr2[]){
        return arr1[0]-arr2[0];
    }
}