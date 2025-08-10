class IntervalComparator implements Comparator<int[]>{
    @Override
    public int compare(int arr1[],int arr2[]){
        return arr1[0]-arr2[0];
    }
}


class Solution {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,new IntervalComparator());
        List<int[]> list=new ArrayList<>();

        for(int[] interval:intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<interval[0]){
                list.add(interval);
            }
            else{
                list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],interval[1]);
            }
        }

        int arr[][]=new int[list.size()][];
        int j=0;
        for(int[] x:list){
            arr[j]=x;
            j++;
        }

        return arr;
        
    }
}