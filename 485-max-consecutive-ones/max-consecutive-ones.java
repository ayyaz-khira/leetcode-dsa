class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int l=0;
        int numOnes=0;
        int max=0;

        for(int i=0;i<n;i++){
            if(nums[i]==1){
                numOnes++;
                max=Math.max(max,numOnes);
            }
            else{
                numOnes=0;
            }
        }

        return max;
    }
}