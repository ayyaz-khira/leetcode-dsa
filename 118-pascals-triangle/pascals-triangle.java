class Solution {

    public List<Integer> rows(int n){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*(n-i+1);
            ans=ans/i;
            list.add(ans);
        }


        return list;
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            res.add(rows(i-1));
        }


        return res;
    }
}