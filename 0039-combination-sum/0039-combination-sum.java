class Solution {
    public void Permute(int arr[],int index,int target,List<List<Integer>> res,List<Integer> comb){
        if(target==0){
            List<Integer> temp=new ArrayList<>();
            for(int x:comb){
                temp.add(x);
            }
            res.add(temp);
            return;
        }
        if(target<0 || index>=arr.length){
            return;
        }

        comb.add(arr[index]);
        Permute(arr,index,target-arr[index],res,comb);
        comb.remove(comb.size()-1);

        Permute(arr,index+1,target,res,comb);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        Permute(candidates,0,target,res,comb);
        return res;
    }
}