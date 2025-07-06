class Solution {

    public void Permute(int arr[],int index,int target,List<List<Integer>> res,List<Integer> comb){
        if(target==0){
            res.add(new ArrayList(comb));
            return;
        }

        if(target<0 || index==arr.length){
            return;
        }

        comb.add(arr[index]);
        Permute(arr,index,target-arr[index],res,comb);
        comb.remove(comb.size()-1);
        Permute(arr,index+1,target,res,comb);

    }


    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        Permute(arr,0,target,res,comb);

        return res;
    }
}