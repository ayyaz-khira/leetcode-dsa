class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxCount=0;
        int freq[]=new int[26];
        int l=0;
        int maxLen=0;

        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            freq[c-'A']++;

            maxCount=Math.max(freq[c-'A'],maxCount);

            if((r-l+1)-maxCount<=k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            else{
                char leftChar=s.charAt(l);
                freq[leftChar-'A']--;
                l++;
            }
        }

        return maxLen;

    }
}