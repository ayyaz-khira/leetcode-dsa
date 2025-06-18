class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        int i=0;
        
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        for(var x:map.entrySet()){
            if(x.getValue()==1){
                arr[i]=x.getKey();
                i++;
            }
        }
        
        return arr;
        
    }
}