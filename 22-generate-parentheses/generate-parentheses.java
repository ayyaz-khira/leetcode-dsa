class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        recurse(res,n,"",0,0);


        return res;



    }


    public void recurse(List<String> res,int n,String path,int countL,int countR){
        if(path.length()==2*n) {
            res.add(path);
            return;
        }


        if(countL<n){
            recurse(res,n,path+"(",countL+1,countR);
        }
        
        if(countR<countL){
            recurse(res,n,path+")",countL,countR+1);

        }


        
        

    
    }
}