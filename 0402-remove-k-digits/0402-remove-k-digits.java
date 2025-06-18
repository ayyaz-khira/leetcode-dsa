class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        for(char c:num.toCharArray()){
            while(k>0 && !stack.isEmpty() && stack.peek()>c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder result=new StringBuilder();
        for(char c:stack){
            result.append(c);
        }

        while(result.length()>0 && result.charAt(0)=='0'){
            result.deleteCharAt(0);
        }

        if(result.length()==0){
            return "0";
        }
        return result.toString();

        


        
    }
}