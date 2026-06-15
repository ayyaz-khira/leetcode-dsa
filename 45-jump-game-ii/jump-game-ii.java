class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1) return 0;
        int prevRange=0;
        int newRange=0;
        int jumps=0;


        for(int i=0;i<n;i++){
            newRange=Math.max(newRange,nums[i]+i);

            if(i==prevRange){
                prevRange=newRange;
                jumps++;

                if(newRange>=n-1){
                    return jumps;
                }
            }
        }


        return jumps;
    }
}