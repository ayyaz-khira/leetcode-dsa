class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);

        int d=Integer.MAX_VALUE;
        int ans=nums[0]+nums[1]+nums[2];
        

        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;

            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                int closest=Math.abs(sum-target);
                if(closest<d){
                    d=closest;
                    ans=sum;
                }
            
                
                if(sum==target) return sum;
                else if(sum>target){
                    r--;
                }
                else{
                    l++;
                }
                
            }
        }


        return ans;
        
    }
}