class Solution {

    public int atMostK(int arr[], int k){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int l=0;
        int count=0;

        for(int r=0;r<n;r++){

            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            while(map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0) map.remove(arr[l]);
                l++;
            }

            count+=r-l+1;
            
        }

        return count;

    }

    public int subarraysWithKDistinct(int[] arr, int k) {
        return atMostK(arr,k)-atMostK(arr,k-1);
    }
}