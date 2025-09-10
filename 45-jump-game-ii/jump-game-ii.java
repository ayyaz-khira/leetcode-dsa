class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int coverage=0;
        int lastJumpInd=0;
        int count=0;

        for(int i=0;i<n-1;i++){
            coverage=Math.max(coverage,i+nums[i]);

            if(i==lastJumpInd){
                lastJumpInd=coverage;
                count++;
            }

            if(i>=coverage){
                return count;
            }
        }

        return count;

    }
}