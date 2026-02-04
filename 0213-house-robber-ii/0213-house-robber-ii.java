class Solution {

    public int robber(int arr[]){
        int n=arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        
        int dp[]=new int[n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        
        return dp[n-1];
    }

    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int max1=robber(Arrays.copyOfRange(nums,0,n-1));
        int max2=robber(Arrays.copyOfRange(nums,1,n));

        return Math.max(max1,max2);

        

    }
}