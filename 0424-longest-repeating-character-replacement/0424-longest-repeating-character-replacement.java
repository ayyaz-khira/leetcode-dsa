class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxLen=Integer.MIN_VALUE;
        int freq[]=new int[26];
        int maxCount=0;
        int l=0;

        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            freq[c-'A']++;

            maxCount=Math.max(maxCount,freq[c-'A']);
            if((r-l+1)-maxCount>k){
                char leftChar=s.charAt(l);
                freq[leftChar-'A']--;
                l++;
            }

            int curWindow=r-l+1;

            maxLen=Math.max(maxCount,curWindow);
        }

        return maxLen;
    }
}