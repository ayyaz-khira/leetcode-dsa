class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1) return 0;
        int curMax=0;
        int maxRange=0;
        int jumps=0;

        for(int i=0;i<n;i++){
            curMax=Math.max(curMax,i+nums[i]);

            if(i==maxRange){
                maxRange=curMax;
                jumps++;

                if(maxRange>=n-1){
                    return jumps;
                }
            }
        }

        return jumps;
    }
}