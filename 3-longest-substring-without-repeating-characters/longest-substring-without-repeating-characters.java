class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int max=0;
        for(int i=0;i<n;i++){

            char c=s.charAt(i);
            
            if(map.containsKey(c)){
                int prevInd=map.get(c);
                if(prevInd>=l){
                    l=prevInd+1;
                }
            }

            max=Math.max(max,i-l+1);

            map.put(c,i);
            
        }


        return max;
    }
}