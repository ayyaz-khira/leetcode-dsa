class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0;
        int n=s.length();
        int freq[]=new int[26];
        int maxCount=0;
        int l=0;


        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            freq[c-'A']++;

            maxCount=Math.max(maxCount,freq[c-'A']);

            if((r-l+1)-maxCount<=k){
                maxLen=Math.max(maxLen,r-l+1);
            }else{
                freq[s.charAt(l)-'A']--;
                l++;
            }
            
            
    
        }


        return maxLen;

    }
}