class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);

        for(int k=0;k<n;k++){
            if(k>0 && nums[k]==nums[k-1]) continue;
            int i=k+1;
            int j=n-1;
            int target=-nums[k];

            while(i<j){
                if(nums[i]+nums[j]==target){
                    res.add(new ArrayList<>(Arrays.asList(nums[k],nums[i],nums[j])));

                    i++;
                    j--;
                    while(i<j && nums[i-1]==nums[i]) i++;
                    while(i<j && nums[j]==nums[j+1]) j--;

                }
                else if(nums[i]+nums[j]>target){
                    j--;
                }
                else{
                    i++;
                }
            }


        }
            return res;
    }
}