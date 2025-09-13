class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int farthest=n-1;

        for(int i=n-2;i>=0;i--){
            if(nums[i]>=farthest-i){
                farthest=i;
            }
        }

        if(farthest==0) return true;

        return false;
    }
}