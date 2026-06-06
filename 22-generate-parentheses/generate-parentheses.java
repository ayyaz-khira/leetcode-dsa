class Solution {
    public List<String> generateParenthesis(int n) {
        int open=0;
        List<String> list=new ArrayList<>();
        int close=0;

        recurse(n,list,"",open,close);

        return list;
        
    }


    public void recurse(int n, List<String> list, String path,int open,int close){

        if(path.length()==2*n){
            list.add(path);
        }

        if(open<n){
            recurse(n,list,path+"(",open+1,close);
        }

        if(close<open){
            recurse(n,list,path+")",open,close+1);
        }


        
    }
}