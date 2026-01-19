class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int x:nums){
            set.add(x);
        }

        int max=0;
    


        for(int x:set){
            
            int curLong=1;
            if(!set.contains(x-1)){
                

                while(set.contains(x+1)){
                    x++;
                    curLong++;
                }

                max=Math.max(max,curLong);

            }
        }


        return max;
    }
}