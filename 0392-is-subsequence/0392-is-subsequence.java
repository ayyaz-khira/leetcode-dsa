class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int m=s.length();
        int n=t.length();
        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;

            }
            else{
                j++;
            }
        }


        if(i==m){
            return true;
        }


        return false;
        
    }
}