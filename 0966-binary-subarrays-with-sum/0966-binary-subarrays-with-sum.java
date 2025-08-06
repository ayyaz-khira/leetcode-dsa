class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int count=0;
        int sum=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            sum+=nums[i];

            if(sum==goal){
                count+=1;
            }

            if(map.containsKey(sum-goal)){
                count+=map.get(sum-goal);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }


        return count;
        
    }
}