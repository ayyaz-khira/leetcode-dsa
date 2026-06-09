class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        recurse(candidates,target,0,res,comb);

        return res;
    }

    public void recurse(int arr[], int target, int ind, List<List<Integer>> res, List<Integer> comb){
        if(target==0){
            res.add(new ArrayList<>(comb));
            return;
        }

        if(target<0 || ind==arr.length) return;

        comb.add(arr[ind]);

        recurse(arr,target-arr[ind],ind,res,comb);

        comb.remove(comb.size()-1);

        recurse(arr,target,ind+1, res,comb);

        
    }
}