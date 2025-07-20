class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int freq[]=new int[26];
        int slidFreq[]=new int[26];
        List<Integer> res=new ArrayList<>();

        int k=p.length();
        int n=s.length();

        for(int i=0;i<k;i++){
            freq[p.charAt(i)-'a']++;
        }

        for(int i=0;i<n;i++){
            slidFreq[s.charAt(i)-'a']++;

            if(i>=k){
                slidFreq[s.charAt(i-k)-'a']--;
            }

            if(Arrays.equals(freq,slidFreq)){
                res.add(i-k+1);
            }
        }


        return res;
    }
}