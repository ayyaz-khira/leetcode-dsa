class Solution {

    public List<Integer> row(int rowNum){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        int ans=1;
        for(int i=1;i<rowNum;i++){
            ans=ans*(rowNum-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            res.add(row(i));
        }

        return res;
    }
}