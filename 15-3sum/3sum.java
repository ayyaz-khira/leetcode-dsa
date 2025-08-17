class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int k=0;k<n;k++){
            if(k>0 && nums[k-1]==nums[k]) continue;
            int n1=nums[k];
            int target=-n1;
            int i=k+1;
            int j=n-1;
            while(i<j){
                if(target==nums[i]+nums[j]){
                    List<Integer> list=new ArrayList<>(Arrays.asList(n1,nums[i],nums[j]));
                    res.add(list);

                    while(i<j && nums[i]==nums[i+1]) i++;
                    while(i<j && nums[j]==nums[j-1]) j--;

                    i++;
                    j--;
                }
                else if(target<nums[i]+nums[j]) j--;
                else i++;
            }

        }

        return res;
        
    }
}