class Solution {
    public int jump(int[] nums) {

        

        int prevRange=0;
        int newRange=0;
        int n=nums.length;
        int jumps=0;

        if(n==1 || n==0) return 0;

        for(int i=0;i<n;i++){
            newRange=Math.max(newRange,nums[i]+i);

            if(i==prevRange){
                prevRange=newRange;
                jumps++;

                if(prevRange>=n-1){
                    return jumps;
                }
            }
        }


        return -1;

    }
}