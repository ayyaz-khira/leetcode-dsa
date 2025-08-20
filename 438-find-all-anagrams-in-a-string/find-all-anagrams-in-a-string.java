class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int freq[]=new int[26];
        int slidingFreq[]=new int[26];
        int k=p.length();
        List<Integer> res=new ArrayList<>();
        int l=0;

        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }

        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            slidingFreq[c-'a']++;

            if(Arrays.equals(freq,slidingFreq)){
                res.add(r-k+1);
            }

            if(r-l+1>=k){
                slidingFreq[s.charAt(l)-'a']--;
                l++;
            }
        }


        return res;

        
    }
}