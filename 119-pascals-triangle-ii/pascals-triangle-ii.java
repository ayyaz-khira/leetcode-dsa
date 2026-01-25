class Solution {

    public List<Integer> row(int rowNum){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        long ans=1;
        for(int i=1;i<rowNum;i++){
            ans=ans*(rowNum-i);
            ans=ans/i;
            list.add((int)ans);
        }
        return list;
    }



    public List<Integer> getRow(int rowIndex) {
        return row(rowIndex+1);
    }
}