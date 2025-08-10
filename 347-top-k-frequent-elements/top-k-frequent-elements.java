class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        int n=nums.length;
        List<Integer>[] bucket=new ArrayList[n+1];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int i=0;i<=n;i++){
            bucket[i]=new ArrayList<>();
        }

        for(var x:map.entrySet()){
            int freq=x.getValue();
            int elements=x.getKey();
            bucket[freq].add(elements);
        }

        int j=0;
        for(int i=bucket.length-1;i>=1 && j<k;i--){
            for(int x:bucket[i]){
                res[j++]=x;
            }
        }

        return res;

        

        



    }
}