class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stk=new Stack<>();

        for(long x:nums){
            long sum=x;
            while(!stk.isEmpty() && sum==stk.peek()){
                sum*=2;
                stk.pop();
                
                
            }
            stk.push(sum);
        
        }

        List<Long> list=new ArrayList<>();

        for(long x:stk){
            list.add(x);
        }
        return list;
    }
}