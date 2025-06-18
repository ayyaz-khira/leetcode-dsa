class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(var x:map.entrySet()){
            if(x.getValue()>n/2){
                return x.getKey();
            }
        }

        return -1;
    }
}