class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLong=0;
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();

        for(int x:nums){
            set.add(x);
        }

        for(int x:set){
            int curLong=1;
            int num=x;
            if(!set.contains(x-1)){
                while(set.contains(num+1)){
                    num++;
                    curLong++;
                }
            }
            maxLong=Math.max(maxLong,curLong);
        }

        return maxLong;

        
    }
}