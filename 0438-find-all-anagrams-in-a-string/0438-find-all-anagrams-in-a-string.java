class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int k=p.length();
        int n=s.length();

        int freq[]=new int[26];
        int slid[]=new int[26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }

        int l=0;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            
            slid[c-'a']++;

            if(r-l+1>k){
                slid[s.charAt(l)-'a']--;
                l++;
            }

            if(Arrays.equals(freq,slid)){
                list.add(r-k+1);
            }

        }


        return list;
    }
}