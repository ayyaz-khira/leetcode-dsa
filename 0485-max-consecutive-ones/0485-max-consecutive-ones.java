class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        int count=0;

        for(int x:nums){
            if(x==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }

        return max;
    }
}