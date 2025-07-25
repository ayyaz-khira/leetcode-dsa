class Solution {
    public String minWindow(String s, String t) {

        int l=0;
        int r=0;
        int minLen=Integer.MAX_VALUE;
        int count=0;
        int freq[]=new int[128];
        String ans="";

        for(char c:t.toCharArray()){
            freq[c]++;
        }

        while(r<s.length()){
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