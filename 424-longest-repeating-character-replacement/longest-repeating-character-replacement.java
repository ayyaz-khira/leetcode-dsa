class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int max=Integer.MIN_VALUE;

        int l=0;
        int freq[]=new int[26];
        int maxFreq=0;

        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            freq[c-'A']++;

            maxFreq=Math.max(maxFreq,freq[c-'A']);

            if((r-l+1)-maxFreq<=k){
                max=Math.max(max,r-l+1);
            }
            else{
                freq[s.charAt(l)-'A']--;
                l++;
            }
            
        }


        return max;
    }
}