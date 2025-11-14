class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int numZeroes=0;
        int max=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0) numZeroes++;

            while(numZeroes>k){
                if(nums[l]==0) numZeroes--;
                l++;
            }

            max=Math.max(max,i-l+1);
        }

        return max;
        
    }
}