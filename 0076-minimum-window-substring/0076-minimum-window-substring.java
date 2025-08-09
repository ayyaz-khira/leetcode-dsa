class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int count=0;
        int minLen=Integer.MAX_VALUE;
        int freq[]=new int[128];
        int l=0;
        String ans="";

        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }

        for(int r=0;r<n;r++){
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
                if(minLen>(r-l+1)){
                    ans=s.substring(l,r+1);
                    minLen=r-l+1;
                }
                l++;
            }

        }

        return ans;
    }
}