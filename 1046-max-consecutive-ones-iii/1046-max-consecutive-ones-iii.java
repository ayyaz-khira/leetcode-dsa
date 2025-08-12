class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int numZeroes=0;
        int l=0;
        int max=0;

        for(int r=0;r<n;r++){
            if(nums[r]==0) numZeroes++;

            while(numZeroes>k){
                if(nums[l]==0) numZeroes--;
                l++;
            }
            max=Math.max(max,r-l+1);
        }

        return max;
        
    }
}