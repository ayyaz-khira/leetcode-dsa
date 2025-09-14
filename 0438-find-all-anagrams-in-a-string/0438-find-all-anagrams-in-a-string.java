class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int freq[]=new int[26];
        int slidFreq[]=new int[26];
        int k=p.length();
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }
        int n=s.length();
        int l=0;

        for(int r=0;r<n;r++){
            char c=s.charAt(r);

            slidFreq[c-'a']++;

            if(Arrays.equals(freq,slidFreq)){
                res.add(r-k+1);
            }


            if(r-l+1>=k){
                slidFreq[s.charAt(l)-'a']--;
                l++;
            }
        }

        return res;
    }
}