class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int curMax=0;
        int max=0;
        int jumps=0;

        if(n==1) return 0;


        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]+i);

            if(i==curMax){
                curMax=max;
                jumps++;


                if(curMax>=n-1){
                    return jumps;
                }
            }

            
        }


        return jumps;

        
    }
}