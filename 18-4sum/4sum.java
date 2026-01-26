class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int first=nums[i];
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int second=nums[j];
                int left=j+1;
                int right=n-1;

                while(left<right){
                    long total=(long)first+second+nums[left]+nums[right];
                    if(total==target){
                        List<Integer> list=new ArrayList<>(Arrays.asList(first,second,nums[left],nums[right]));
                        res.add(list);
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    
                    }
                    else if(total<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }


        return res;
    }
}