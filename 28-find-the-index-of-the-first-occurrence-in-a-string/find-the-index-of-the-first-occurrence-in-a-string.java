class Solution {
    public int strStr(String haystack, String needle) {
        
        int k=needle.length();
        int n=haystack.length();
        

        for(int i=0;i<=n-k;i++){
           if(haystack.substring(i,i+k).equals(needle)){
            return i;
           }
        }



        return -1;



    }
}