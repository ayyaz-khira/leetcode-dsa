class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int freq[]=new int[26];   

        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }

        return -1;
    }
}