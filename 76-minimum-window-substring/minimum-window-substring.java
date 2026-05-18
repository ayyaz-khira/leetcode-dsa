class Solution {
    public String minWindow(String s, String t) {
        int freq[]=new int[128];

        int count=0;
        int l=0;
        int min=Integer.MAX_VALUE;
        int n=s.length();
        String ans="";
        

        for(char c:t.toCharArray()){
            freq[c]++;
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

                if((r-l+1)<min){
                    min=r-l+1;
                    ans=s.substring(l,r+1);
                }


                l++;
            }
        }


        return min==Integer.MAX_VALUE ? "" : ans;
    }
}