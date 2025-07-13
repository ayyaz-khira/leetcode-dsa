class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>[] bucket=new ArrayList[n+1];
        int res[]=new int[k];

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }

        for(var x:map.entrySet()){
            int key=x.getKey();
            int freq=x.getValue();
            bucket[freq].add(key);
        }

        int ind=0;
        for(int i=bucket.length-1;i>=0 && ind<k;i--){
            for(int x:bucket[i]){
                res[ind]=x;
                ind++;
            }
        }


        return res;

        
    }
}