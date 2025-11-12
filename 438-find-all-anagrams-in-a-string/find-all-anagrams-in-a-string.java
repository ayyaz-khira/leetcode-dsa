class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int k=p.length();
        int n=s.length();

        int freq[]=new int[26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }
        int slidFreq[]=new int[26];
        int l=0;

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            slidFreq[c-'a']++;

            if((i-l+1)>k){
                slidFreq[s.charAt(l)-'a']--;
                l++;
            }
            if(Arrays.equals(freq,slidFreq)){
                list.add(i-k+1);
            }

        }


        return list;
    }
}