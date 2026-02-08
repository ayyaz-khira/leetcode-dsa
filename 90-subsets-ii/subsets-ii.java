class Solution {

    public void recurse(int arr[],int ind,List<Integer> comb,List<List<Integer>> res){
    
        res.add(new ArrayList<>(comb));

        for(int i=ind;i<arr.length;i++){
        
        if(i>ind && arr[i]==arr[i-1]) continue;
        comb.add(arr[i]);
        recurse(arr,i+1,comb,res);
        comb.remove(comb.size()-1);


        

        }
    }


    public List<List<Integer>> subsetsWithDup(int[] arr) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> comb=new ArrayList<>();
        Arrays.sort(arr);
        recurse(arr,0,new ArrayList<>(),res);


        return res;
    }
}