class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();

        int l=0;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.size()>=3){
                char leftChar=s.charAt(l);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0) map.remove(leftChar);
                l++;
                count+=n-r;
            }


        }

        return count;
    }
}