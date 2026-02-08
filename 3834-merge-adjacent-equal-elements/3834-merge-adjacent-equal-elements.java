class Solution {
    public List<Long> mergeAdjacent(int[] arr) {
        Stack<Long> stk=new Stack<>();

        for(int x:arr){
            long element=(long) x;
            while(!stk.isEmpty() && stk.peek()==element){
                element=element*2;
                stk.pop();
                
            }

            stk.push(element);
        }

        return new ArrayList<>(stk);
    }
}