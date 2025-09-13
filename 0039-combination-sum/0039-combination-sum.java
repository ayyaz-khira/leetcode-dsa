class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        permute(candidates,0,target,res,new ArrayList<>());

        return res;
    }

    public void permute(int arr[],int ind,int target,List<List<Integer>> res,ArrayList<Integer> comb){
        if(target==0){
            ArrayList<Integer> arr1=new ArrayList<>(comb);
            res.add(arr1);
            return;
        }

        if(target<0 || ind==arr.length){
            return;
        }

        comb.add(arr[ind]);
        permute(arr,ind,target-arr[ind],res,comb);
        comb.remove(comb.size()-1);

        permute(arr,ind+1,target,res,comb);
    }


}