class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }

        for(var x:map.entrySet()){
            int key=x.getKey();
            int freq=x.getValue();
            bucket[freq].add(key);
        }
        int res[]=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0 && index<k;i--){
            for(int x:bucket[i]){
                res[index++]=x;
                if(index==k) break;
            }
        }


        return res;
    }
}