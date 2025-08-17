class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        int l=0;
        List<Integer> list=new ArrayList<>();

        int freq[]=new int[26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }

        int slidFreq[]=new int[26];
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            slidFreq[c-'a']++;

            if(Arrays.equals(freq,slidFreq)){
                list.add(r-k+1);
            }
            
            if(r-l+1>=k){
                slidFreq[s.charAt(l)-'a']--;
                l++;
            }


        }


        return list;
    }
}