class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int num=0;
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        for(var x:map.entrySet()){
            if(x.getValue()==1){
                num=x.getKey();
            }
        }
        
        return num;
    }
}