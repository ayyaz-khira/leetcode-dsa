class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-z0-9A-Z]","").toLowerCase();
        int lower=0;
        int upper=str.length()-1;
        while(lower<upper){
            if(str.charAt(lower)!=str.charAt(upper)){
                return false;
            }
            lower++;
            upper--;
        }

        return true;
    }
}
