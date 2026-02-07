class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n=candidates.length;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        recurse(candidates,0,target,res,comb);

        return res;


    

    }


    public void recurse(int arr[],int ind,int target,List<List<Integer>> res,List<Integer> comb){
        if(target==0){
            res.add(new ArrayList<>(comb));
            return;
        }

        if(target<0 || ind==arr.length){
            return;
        }

        comb.add(arr[ind]);
        recurse(arr,ind,target-arr[ind],res,comb);
        comb.remove(comb.size()-1);

        recurse(arr,ind+1,target,res,comb);
    }
}