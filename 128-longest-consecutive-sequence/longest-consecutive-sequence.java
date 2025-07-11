class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;

        HashSet<Integer> set=new HashSet<>();
        int max=0;

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


            max=Math.max(max,curLongest);
        }


        return max;
    }
}