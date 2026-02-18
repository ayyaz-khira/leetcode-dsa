class Solution {
    public int firstUniqueFreq(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }


        HashMap<Integer,Integer> map2=new HashMap<>();
        for(var x:map.entrySet()){
            map2.put(x.getValue(),map2.getOrDefault(x.getValue(),0)+1);
        }


        for(int i=0;i<n;i++){
            if(map2.get(map.get(nums[i]))==1){
                return nums[i];
            }
        }

       
        


        return -1;
    }
}