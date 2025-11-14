class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[k];
        List<Integer>[] bucket=new ArrayList[n+1];
        int j=0;

        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(var x:map.entrySet()){
            int key=x.getKey();
            int freq=x.getValue();
            bucket[freq].add(key);
        }

        for(int i=bucket.length-1;i>=0 && j<k;i--){
            for(int x:bucket[i]){
                res[j++]=x;   
            }
            
        }


        return res;
    }
}