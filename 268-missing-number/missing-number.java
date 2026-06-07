class Solution {
    public int missingNumber(int[] nums) {
        
        long sum1=0;
        long sum2=0;

        for(long i=1;i<=nums.length;i++){
            sum1+=i;
        }

        for(long x:nums){
            sum2+=x;
        }

        return (int)(sum1-sum2);
    }
}