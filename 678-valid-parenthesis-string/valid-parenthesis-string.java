class Solution {
    public boolean checkValidString(String s) {        
        int n=s.length();

        int min=0;
        int max=0;

        for(char c:s.toCharArray()){
            if(c=='('){
                min+=1;
                max+=1;
            }
            else if(c==')'){
                min-=1;
                max-=1;
            }
            else{
                min=min-1;
                max=max+1;
            }

                if(min<0) min=0;
            if(max<0) return false;
        }

        
        if(min==0) return true;


        

        return false;

       
    }

    
}