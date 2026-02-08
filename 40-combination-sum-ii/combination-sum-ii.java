class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n=candidates.length;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        recurse(candidates,0,target,res,comb);

        return new ArrayList<>(res);
    }

    public void recurse(int arr[],int ind,int target,List<List<Integer>> res,List<Integer> comb){
        if(target==0){
            res.add(new ArrayList<>(comb));
            return;
        }

        if(target<0 || ind==arr.length){
            return;
        }

        for(int i=ind;i<arr.length;i++){
        
        if(i>ind && arr[i]==arr[i-1]) continue;
        if(arr[i]>target) break;        

        comb.add(arr[i]);
        recurse(arr,i+1,target-arr[i],res,comb);
        comb.remove(comb.size()-1);


        }


    }
}