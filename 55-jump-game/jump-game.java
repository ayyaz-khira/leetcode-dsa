class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int lastInd=n-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]>=lastInd-i){
                lastInd=i;
            }
        }


        if(lastInd==0) return true;

        return false;
    }
}