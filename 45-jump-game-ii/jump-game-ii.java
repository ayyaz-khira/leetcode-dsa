class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        int range=0;
        int lastInd=0;
        int count=0;

        for(int i=0;i<n;i++){
            range=Math.max(range,nums[i]+i);
            if(i==lastInd){
                lastInd=range;
                count++;

                if(range>=n-1){
                    return count;
                }

            }
        }


        return count;
    }
}