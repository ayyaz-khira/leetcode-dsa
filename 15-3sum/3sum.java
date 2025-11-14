class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        

        for(int k=0;k<n;k++){
            if(k>0 && nums[k]==nums[k-1]) continue;
            int i=k+1;
            int j=n-1;
            int first=nums[k];
            int target=-first;

            while(i<j){

                if(target==nums[i]+nums[j]){
                    List<Integer> list=new ArrayList<>(Arrays.asList(first,nums[i],nums[j]));
                    res.add(list);

                    i++;
                    j--;
                    
                    while(i<j && nums[i]==nums[i-1]) i++;
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