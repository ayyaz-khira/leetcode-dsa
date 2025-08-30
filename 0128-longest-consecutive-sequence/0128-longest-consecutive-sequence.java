class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int x:nums){
            set.add(x);
        }

        for(int x:set){
            if(!set.contains(x-1)){
                int curLong=1;
                int curNum=x;
                while(set.contains(curNum+1)){
                    curNum++;
                    curLong++;
                }
                max=Math.max(max,curLong);
            }
        }


        return max;
    }
}