class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        int total=0;

        for(int x:nums){
            total+=x;
        }
        

        for(int i=0;i<n;i++){
            sum+=nums[i];
            int leftSum=sum-nums[i];
            int rightSum=total-leftSum-nums[i];
            if(rightSum==leftSum) return i;
        }


        return -1;
    }
}