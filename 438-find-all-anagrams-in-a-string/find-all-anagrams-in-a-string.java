class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();

        int l=0;
        int freq[]=new int[128];
        int slidFreq[]=new int[128];
        int k=p.length();
        int n=s.length();

        for(char c:p.toCharArray()){
            freq[c]++;
        }
    
        for(int r=0;r<n;r++){
            char c=s.charAt(r);

            slidFreq[c]++;


            while(r-l+1>k){
                char leftChar=s.charAt(l);
                slidFreq[leftChar]--;
                l++;
            }

            if(Arrays.equals(freq,slidFreq)){
                list.add(r-k+1);
            }
        }


        return list;
    }
}