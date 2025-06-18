class Solution {
    public String truncateSentence(String s, int k) {
        String words[]=s.split(" ");

        int i=0;
        String res="";
        for(String x:words){
            if(i<k){
                
                res=res+x;
                if(i!=k-1){
                    res+=" ";
                }
                i++;
            }
        }

        return res;
        
    }
}