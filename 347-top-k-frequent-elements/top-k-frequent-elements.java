class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        ArrayList<Integer>[] bucket=new ArrayList[n+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        int res[]=new int[k];

        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }


        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(var x:map.entrySet()){
            int key=x.getKey();
            int freq=x.getValue();
            bucket[freq].add(key);
        }

        int j=0;
        for(int i=bucket.length-1;i>=0 && k>0;i--){
            for(int x:bucket[i]){
                res[j++]=x;
                k--;
                if(k==0) break;
            }
        }

        return res;

    }
}