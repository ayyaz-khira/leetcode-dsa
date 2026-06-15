class Solution {

    public void recurse(int n,String path,List<String> res, int open, int close){
        if(path.length()==2*n){
            res.add(path);
            return;
        }


        if(open<n){
            recurse(n,path+'(',res,open+1,close);
        }

        if(close<open){
            recurse(n,path+')',res,open,close+1);
        }


    }


    public List<String> generateParenthesis(int n) {
        
        List<String> res=new ArrayList<>();

        recurse(n,"",res,0,0);


        return res;

        

    }
}