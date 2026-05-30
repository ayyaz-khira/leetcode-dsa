class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk=new Stack<>();
        StringBuilder res=new StringBuilder();
        int n=num.length();

        for(int i=0;i<n;i++){

            char numm=num.charAt(i);

            while(!stk.isEmpty() && k>0 && numm<stk.peek()){
                stk.pop();
                k--;
            }

            stk.push(numm);
        }


        while(!stk.isEmpty() && k>0){
            stk.pop();
            k--;
        }

        for(char c:stk){
            res.append(c);
        }

        while(!res.isEmpty() && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }

        if(res.length()==0) return "0";


        return res.toString();
    }
}