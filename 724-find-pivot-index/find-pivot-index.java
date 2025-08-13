class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int x:nums){
            total+=x;
        }
        
        int leftSum=0;
        for(int i=0;i<n;i++){
            int rightSum=total-leftSum-nums[i];
            if(leftSum==rightSum) return i;

            leftSum+=nums[i];
        }

        return -1;
    }
}