class Solution {
    public int findMaxLength(int[] arr) {
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }

        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum==0){
                max=Math.max(max,i+1);
            }
            
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        
        return max;
    }
}