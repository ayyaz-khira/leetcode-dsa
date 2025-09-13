class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        List<Integer>[] bucket=new ArrayList[n+1];
        int res[]=new int[k];
        int j=0;

        for(int i=0;i<=n;i++){
            bucket[i]=new ArrayList<>();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(var x:map.entrySet()){
            int freq=x.getValue();
            int key=x.getKey();
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