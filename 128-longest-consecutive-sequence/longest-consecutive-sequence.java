class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }

        int longest=0;

        for(int x:set){

            int curLongest=1;
            int curNum=x;
            if(!set.contains(x-1)){

            while(set.contains(curNum+1)){
                curLongest++;
                curNum++;
            }

            }
            longest=Math.max(longest,curLongest);
        }

        return longest;
    }
}