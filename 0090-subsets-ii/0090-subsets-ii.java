class Solution {

    public void recurse(int arr[],int ind,List<Integer> comb,HashSet<List<Integer>> res){
        if(ind==arr.length){
            res.add(new ArrayList<>(comb));
            return;
        }

        comb.add(arr[ind]);
        recurse(arr,ind+1,comb,res);
        comb.remove(comb.size()-1);

        recurse(arr,ind+1,comb,res);
    }


    public List<List<Integer>> subsetsWithDup(int[] arr) {
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(arr);
        recurse(arr,0,new ArrayList<>(),set);


        return new ArrayList<>(set);
    }
}