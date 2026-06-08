class Solution {

    public List<Integer> getRow(int n){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        long ans=1;

        for(long i=1;i<=n;i++){
            ans=(ans*(n-i+1))/i;
            list.add((int)ans);
        }

        return list;
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            res.add(getRow(i-1));
        }


        return res;
    }
}