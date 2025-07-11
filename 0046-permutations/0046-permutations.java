class Solution {
    public void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    public void Permute(int arr[],int start,int end,List<List<Integer>> res){
        if(start>=end){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int x:arr){
                temp.add(x);
            }
            res.add(temp);
            return;
        }
        
        for(int i=start;i<=end;i++){
            swap(arr,start,i);
            Permute(arr,start+1,end,res);
            swap(arr,start,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Permute(nums,0,nums.length-1,res);
        return res;
    }
}