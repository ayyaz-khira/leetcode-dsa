class Solution {
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    
    
    public String longestPalindrome(String s) {
        int n=s.length();
        
        String max="";
        for(int i=0;i<n;i++){
        
            for(int j=i+1;j<=n;j++){
                String sub=s.substring(i,j);
                if(isPalindrome(sub) && sub.length()>max.length()){
                    max=sub;
                }
            }
        }
        
        return max;
        
    }
}