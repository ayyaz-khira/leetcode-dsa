class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        char arr[]=s.toCharArray();
        int left=0;
        for(int  right=0;right<n;right++){
            if(map.containsKey(arr[right])){
                int prevIndex=map.get(arr[right]);
                if(prevIndex>=left){
                    left=prevIndex+1;
                }
            }
            map.put(arr[right],right);
            max=Math.max(max,right-left+1);
        }


        return max;
        
    }
}