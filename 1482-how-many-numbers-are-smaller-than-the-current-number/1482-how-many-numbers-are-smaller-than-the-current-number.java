class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i]){
                    arr[k]++;
                }
            }
            k++;
        }

        return arr;
    }
}