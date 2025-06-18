class Solution {
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String str=s.toLowerCase();

        String a=str.substring(0,n/2);
        String b=str.substring(n/2,n);

        int count1=0;
        int count2=0;

        for(char c:a.toCharArray()){
            if(isVowel(c)){
                count1++;
            }
        }

        for(char c:b.toCharArray()){
            if(isVowel(c)){
                count2++;
            }
        }


        if(count1==count2) return true;
        return false;
        
    }
}