class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int n=t.length();

        while(i<s.length() && j<n){

            if(s.charAt(i)==t.charAt(j)){
                i++;
            }

            j++;
        }
        if(i==s.length()) return true;

        return false;
    }
}