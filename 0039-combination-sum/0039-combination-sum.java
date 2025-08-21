class Solution {

    public void solve(int arr[],int ind,int target,List<Integer> comb,List<List<Integer>> res){
        if(target==0){
            ArrayList temp=new ArrayList<>(comb);
            res.add(temp);
            return;
        }

        if(target<0 || ind==arr.length){
            return;
        }

        comb.add(arr[ind]);
        solve(arr,ind,target-arr[ind],comb,res);
        comb.remove(comb.size()-1);

        solve(arr,ind+1,target,comb,res);
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        Arrays.sort(candidates);

        solve(candidates,0,target,comb,res);

        return res;
    }
}