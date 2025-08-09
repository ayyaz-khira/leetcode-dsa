class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        List<Integer> arr=new ArrayList<>();
        int k=p.length();
        int freq[]=new int[26];
        int slidFreq[]=new int[26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }

        int l=0;

        for(int i=0;i<n;i++){
            char c=s.charAt(i);

            slidFreq[c-'a']++;

            if(i>=k){
                slidFreq[s.charAt(l)-'a']--;
                l++;
            }

            if(Arrays.equals(freq,slidFreq)){
                arr.add(i-k+1);
            }
        }


        return arr;
    }
}