class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1) return 0;
        int maxReach=0;
        int lastWindow=0;
        int jumps=0;

        for(int i=0;i<n;i++){
            maxReach=Math.max(maxReach,i+nums[i]);

            if(i==lastWindow){
                lastWindow=maxReach;
                jumps++;

                if(lastWindow>=n-1){
                    return jumps;
                }
            }
        }

        return jumps;
    }
}