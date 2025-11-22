class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);
    }

    public int atMostK(int arr[],int k){
        int n=arr.length;
        int count=0;
        int l=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<n;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            while(map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0) map.remove(arr[l]);
                l++;
            }

            count+=(r-l+1);
        }


        return count;
    }
}