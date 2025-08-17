class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,new IntervalSort());
        

        for(int[] interval:intervals){
            if(res.isEmpty() || res.get(res.size()-1)[1]<interval[0]){
                res.add(interval);
            }
            else{
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],interval[1]);
            }
        }

        int arr[][]=new int[res.size()][];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }

        return arr;
        
    }
}

class IntervalSort implements Comparator<int[]>{
    public int compare(int arr1[],int arr2[]){
        return arr1[0]-arr2[0];
    }
}