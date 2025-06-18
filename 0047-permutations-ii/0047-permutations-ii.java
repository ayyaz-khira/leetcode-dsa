class Solution {

    public void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public void Permute(int arr[],HashSet<ArrayList<Integer>> set,int start,int end){
        if(start==end){
            ArrayList<Integer> res=new ArrayList<>();
            for(int x:arr){
                res.add(x);
            }
            set.add(res);

            return;
        }


        for(int i=start;i<=end;i++){
            swap(arr,i,start);
            Permute(arr,set,start+1,end);
            swap(arr,i,start);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

    HashSet<ArrayList<Integer>> set=new HashSet<>();
    Permute(nums,set,0,nums.length-1);

    List<List<Integer>>  list=new ArrayList<>();
    for(var x:set){
        list.add(x);
    }

    return list;

        
    }
}