class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int freq[]=new int[26];
        int slid[]=new int[26];
        List<Integer> res=new ArrayList<>();

        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }

        int l=0;

        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);

            slid[c-'a']++;

            if(Arrays.equals(freq,slid)){
                res.add(r-p.length()+1);
            }
            if(r-l+1>=p.length()){
                slid[s.charAt(l)-'a']--;
                l++;
            }
        }

        return res;
    }
}