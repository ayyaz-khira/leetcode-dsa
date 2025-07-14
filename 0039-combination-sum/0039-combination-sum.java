class Solution {

    public void Permute(int arr[],int ind,int target,List<List<Integer>> res,List<Integer> comb){
        if(target==0){
            res.add(new ArrayList(comb));
            return;
        }

        if(target<0 || ind==arr.length){
            return;
        }

        comb.add(arr[ind]);
        Permute(arr,ind,target-arr[ind],res,comb);
        comb.remove(comb.size()-1);


        Permute(arr,ind+1,target,res,comb);
    }



    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();

        Permute(candidates,0,target,res,comb);

        return res;
    }
}