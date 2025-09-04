class CustomComparator implements Comparator<int[]>{
    public int compare(int a[],int b[]){
        return Integer.compare(a[0],b[0]);
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new CustomComparator());
        int n=intervals.length;
        List<int[]> list=new ArrayList<>();
        for(int x[]:intervals){
            if(list.isEmpty() || x[0]>list.get(list.size()-1)[1]){
                list.add(x);
            }
            else{
                list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],x[1]);
            }
        }


        int result[][]=new int[list.size()][];
        int j=0;
        for(int x[]:list){
            result[j++]=x;


        }


        return result;




    }
}