class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxOnes=0;
        int curOnes=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                curOnes++;
                maxOnes=Math.max(maxOnes,curOnes);
            }else{
                curOnes=0;
            }
        }

        return maxOnes;
    }
}