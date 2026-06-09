class Solution {
    public int numberOfSubstrings(String s) {
        long n=s.length();
        long prod=n*(n+1)/2;
        return (int)prod-atMostK(s,2);
        
    }


    public int atMostK(String s,int k){
        int n=s.length();
        long count=0;
        int l=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.size()>k){
                char leftChar=s.charAt(l);
            
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0) map.remove(leftChar);
                l++;
            }
            count+=r-l+1;

        }


        return (int)count;

    }

    
}