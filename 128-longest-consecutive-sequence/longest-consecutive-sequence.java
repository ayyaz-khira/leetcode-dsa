class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        
        int max=0;

        for(int x:set){
            int num=x;
            int curlong=1;

            if(!set.contains(x-1)){
                while(set.contains(num+1)){
                    curlong++;
                    num++;
                }
            }

            max=Math.max(max,curlong);
        }

        return max;
    }
}