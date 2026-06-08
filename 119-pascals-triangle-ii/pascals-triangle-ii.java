class Solution {

    public List<Integer> Row(int n){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        long ans=1;

        for(long i=1;i<=n;i++){
            ans=(ans*(n-i+1))/i;
            list.add((int)ans);
        }

        return list;
    }


    public List<Integer> getRow(int rowIndex) {
        return Row(rowIndex);
    }
}