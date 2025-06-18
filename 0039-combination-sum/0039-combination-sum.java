class Solution {

    public void Permute(int arr[],List<List<Integer>> res,List<Integer> comb,int target,int index){
        if(target==0){
            res.add(new ArrayList<>(comb));
            return;
        }

        if(index>=arr.length || target<0){
            return;
        }

        comb.add(arr[index]);
        Permute(arr,res,comb,target-arr[index],index);
        comb.remove(comb.size()-1);

        Permute(arr,res,comb,target,index+1);

    }







    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> comb=new ArrayList<>();

        Permute(candidates,arr,comb,target,0);
        return arr;
        
    }
}