class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        recurse(n,res,0,0,"");

        return res;
    }

    public void recurse(int n,List<String> res,int open,int close,String cur){
        if(cur.length()==(2*n)){
            res.add(cur);
            return;
        }


        if(open<n){
            recurse(n,res,open+1,close,cur+"(");
        }

        if(close<open){
            recurse(n,res,open,close+1,cur+")");
        }
    }
}