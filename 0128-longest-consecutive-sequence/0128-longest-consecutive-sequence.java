class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        int longest=0;
        for(int x:nums){
            set.add(x);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentLongest=1;

                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentLongest++;
                }
                longest=Math.max(longest,currentLongest);
            }
        }

        return longest;
    }
}