class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int lastInd=n-1;
        for(int i=n-1;i>=0;i--){
            if(lastInd-i<=nums[i]){
                lastInd=i;
            }
        }

        if(lastInd==0) return true;
        return false;
    }
}