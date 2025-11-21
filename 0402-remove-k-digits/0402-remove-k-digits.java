class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk=new Stack<>();

        for(char c:num.toCharArray()){
            while(!stk.isEmpty() && k>0 && stk.peek()>c){
                stk.pop();
                k--;
            }
            stk.push(c);
        }

        while(!stk.isEmpty() && k>0){
            stk.pop();
            k--;
        }

        StringBuilder res=new StringBuilder();
        for(char c:stk){
            res.append(c);
        }

        while(res.length()!=0 && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }


        if(res.length()==0){
            return "0";
        }

        return res.toString();
    }
}