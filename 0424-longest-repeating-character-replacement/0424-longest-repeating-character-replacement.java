class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int max=0;
        int l=0;
        int maxCount=0;
        int freq[]=new int[26];
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            freq[c-'A']++;
            maxCount=Math.max(maxCount,freq[c-'A']);

            if((r-l+1)-maxCount>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }

            max=Math.max(max,r-l+1);
        }


        return max;

    }
}