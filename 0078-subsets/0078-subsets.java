class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        recurse(nums,0,res,comb);

        return res;
    }


    public void recurse(int arr[],int ind,List<List<Integer>> res,List<Integer> comb){
        if(ind==arr.length){
            res.add(new ArrayList<>(comb));
            return;
        }

        comb.add(arr[ind]);
        recurse(arr,ind+1,res,comb);
        comb.remove(comb.size()-1);

        recurse(arr,ind+1,res,comb);


    }
}