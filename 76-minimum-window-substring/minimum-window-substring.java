class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int freq[]=new int[128];

        for(char c:t.toCharArray()){
            freq[c]++;
        }
        String ans="";
        int count=0;
        int l=0;
        int r=0;
        int minLen=Integer.MAX_VALUE;
        while(r<n){
            char c=s.charAt(r);
            freq[c]--;
            if(freq[c]>=0){
                count++;
            }

            while(count==t.length()){
                char leftChar=s.charAt(l);
                freq[leftChar]++;
                if(freq[leftChar]>0){
                    count--;
                }
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    ans=s.substring(l,r+1);
                }
                l++;
            }
            r++;
        }

        return ans;
    }
}