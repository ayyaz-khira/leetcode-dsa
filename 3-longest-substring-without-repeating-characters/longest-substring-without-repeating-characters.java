class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;

        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int l=0;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);

            if(map.containsKey(c)){
                int leftInd=map.get(c);
                if(leftInd>=l){
                    l=leftInd+1;
                }
            }


            max=Math.max(max,r-l+1);

            map.put(c,r);


        }


        return max;
    }
}