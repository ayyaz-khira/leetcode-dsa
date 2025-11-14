class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        int totalSum=0;
        int leftSum=0;
        int rightSum=0;

        for(int x:nums){
            totalSum+=x;
        }

        for(int i=0;i<n;i++){
            sum+=nums[i];
            leftSum=sum-nums[i];
            rightSum=totalSum-leftSum-nums[i];
            if(leftSum==rightSum) return i;
        }

        return -1;
    }
}