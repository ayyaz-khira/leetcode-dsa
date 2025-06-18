class Solution {

    public void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public void Permute(int arr[],List<List<Integer>> res,int start,int end){
        if(start==end){
            List<Integer> list=new ArrayList<>();
            for(int x:arr){
                list.add(x);
            }
            res.add(list);
            return;
        }

        for(int i=start;i<=end;i++){
            swap(arr,i,start);
            Permute(arr,res,start+1,end);
            swap(arr,i,start);
        }

    
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
    
        Permute(nums,res,0,nums.length-1);

        return res;

        
    }
}