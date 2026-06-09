class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int max=0;
        int vowels=0;
        int l=0;
    
        for(int i=0;i<n;i++){
            char c=s.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels++;
            }

            while(i-l+1>k){
                char left=s.charAt(l);
                if(left=='a' || left=='e' || left=='i' || left=='o' || left=='u'){
                vowels--;
                }
                l++;
            }

            max=Math.max(max,vowels);

            

        }

        return max;


    }
}