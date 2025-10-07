class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            sum+=x;

            if(sum==k){
                count+=1;
            }

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}