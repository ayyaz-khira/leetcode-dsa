class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        int n=nums.length;
        for(int x:nums){
            total+=x;
        }

        int rightSum=0;
        int leftSum=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            rightSum=sum-nums[i];
            leftSum=total-rightSum-nums[i];
            if(leftSum==rightSum) return i;
        }

        return -1;
    }
}