class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>(); 
        List<Integer> bucket[]=new ArrayList[n+1];
        int res[]=new int[k];
        int j=0;

        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int i=0;i<=n;i++){
            bucket[i]=new ArrayList<>();
        }

        for(var x:map.entrySet()){
            int key=x.getKey();
            int freq=x.getValue();
            bucket[freq].add(key);
        }

        for(int i=bucket.length-1;i>=0 && j<k;i--){
            for(int x:bucket[i]){
                res[j]=x;
                j++;
                if(j==k) break;
            }
        }


        return res;


    }
}