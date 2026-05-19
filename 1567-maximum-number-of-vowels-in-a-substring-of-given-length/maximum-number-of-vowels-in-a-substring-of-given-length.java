class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        int l=0;
        int max=0;


        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }

            while((r-l+1)>k){
                char lc=s.charAt(l);
                if(lc=='a' || lc=='e' || lc=='i' || lc=='o' || lc=='u'){
                    count--;
                }
                l++;
            }

            max=Math.max(max,count);
        }


        return max;
        
    }

    
        
}