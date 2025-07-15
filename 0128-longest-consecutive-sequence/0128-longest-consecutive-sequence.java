class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int longest=0;

        for(int x:nums){
            set.add(x);
        }


        for(int x:set){
                int curNum=x;
                int curLongest=1;
            if(!set.contains(x-1)){

                while(set.contains(curNum+1)){
                    curNum++;
                    curLongest++;
                }

            }
                longest=Math.max(longest,curLongest);
        }

        return longest;
    }
}