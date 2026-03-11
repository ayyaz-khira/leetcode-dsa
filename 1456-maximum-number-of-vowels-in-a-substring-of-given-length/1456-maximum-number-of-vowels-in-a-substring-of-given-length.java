class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int vowels=0;
        int l=0;
        int max=0;
        
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels+=1;
            }

            while(r-l+1>=k){
                max=Math.max(max,vowels);
                char lc=s.charAt(l);
                if(lc=='a' || lc=='e' || lc=='i' || lc=='o' || lc=='u'){
                vowels-=1;
                }
                l+=1;



            }

        }

        return max;


    }
}