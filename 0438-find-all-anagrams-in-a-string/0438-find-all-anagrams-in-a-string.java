class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();

        List<Integer> list=new ArrayList<>();

        int freq[]=new int[26];
        int curFreq[]=new int[26];

        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }

        int l=0;
        
        
        for(int r=0;r<n;r++){
            curFreq[s.charAt(r)-'a']++;

            if(r-l+1>k){
                curFreq[s.charAt(l)-'a']--;
                l++;
            }

            if(Arrays.equals(freq,curFreq)){
                list.add(r-k+1);
            }


        }


        return list;
    }
}