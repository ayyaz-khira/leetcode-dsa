class Solution {
    public int missingNumber(int[] nums) {
        long sum=0;
        long sum2=0;
        int n=nums.length;

        for(long x:nums){
            sum+=x;
        }

        for(long i=1;i<=n;i++){
            sum2+=i;
        }

        return (int)(sum2-sum);
        


       
    }
}