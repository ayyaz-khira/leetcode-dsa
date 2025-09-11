class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxFreq=0;
        int freq[]=new int[26];
        int l=0;
        int maxLen=0;

        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            freq[c-'A']++;
            maxFreq=Math.max(maxFreq,freq[c-'A']);

            if((r-l+1)-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            
            maxLen=Math.max(maxLen,r-l+1);
        }


        return maxLen;
    }
}