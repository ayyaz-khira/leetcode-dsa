class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int prevMaxLimit=0;
        int newMaxLimit=0;
        int jump=0;
        if(n==1) return 0;

        for(int i=0;i<n;i++){
            newMaxLimit=Math.max(newMaxLimit,i+nums[i]);

            if(i==prevMaxLimit){
                prevMaxLimit=newMaxLimit;
                jump++;

            if(prevMaxLimit>=n-1){
                return jump;
            }
            
            }

        }

        return jump;


    }
}