class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();
        int n=asteroids.length;
        
        for(int x:asteroids){
            while(!stk.isEmpty() && stk.peek()>0 && x<0){
                if(Math.abs(x)>Math.abs(stk.peek())){
                    stk.pop();
                }
                else if(Math.abs(x)<Math.abs(stk.peek())){
                    x=0;
                    break;
                }
                else{
                    stk.pop();
                    x=0;
                    break;
                }
            }
            if(x!=0) stk.push(x);
        }

        int res[]=new int[stk.size()];
        int i=0;
        for(int x:stk){
            res[i++]=x;

        }

        return res;
    }
}