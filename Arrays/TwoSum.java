class Solution {
    public int[] twoSum(int[] arr, int target) {
        int res[]=new int[2];

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                res[0]=map.get(target-arr[i]);
                res[1]=i;
                return res;
            }

            map.put(arr[i],i);
        }
        Arrays.fill(res,-1);
        return res;
        
    }
}
