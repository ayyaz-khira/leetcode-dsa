class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(var x:map.entrySet()){
            if(x.getValue()==2){
                list.add(x.getKey());
            }
        }

        return list;
    }
}