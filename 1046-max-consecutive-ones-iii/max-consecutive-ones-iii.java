class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int curZeroes=0;
        int max=0;
        int l=0;
        
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                curZeroes++;
            }

            while(curZeroes>k){
                if(nums[l]==0){
                    curZeroes--;
                }
                    l++;
            }

            max=Math.max(max,r-l+1);
        }

        return max;
    }
}