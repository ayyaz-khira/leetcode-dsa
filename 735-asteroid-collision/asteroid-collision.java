class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();

        for(int asteroid:asteroids){
            int x=asteroid;
            
            while(!stk.isEmpty() && x<0 && stk.peek()>0){
                if(Math.abs(x)>Math.abs(stk.peek())){
                    stk.pop();
                }
                else if(Math.abs(stk.peek())>Math.abs(x)){
                    x=0;
                }
                else{
                    x=0;
                    stk.pop();
                }
            }

            if(x!=0) stk.push(x);

        }

        int res[]=new int[stk.size()];
        int i=0;
        for(int x: stk){
            res[i++]=x;
        }
        return  res;
    }
}