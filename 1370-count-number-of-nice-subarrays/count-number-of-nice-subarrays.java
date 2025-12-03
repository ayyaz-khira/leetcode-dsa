class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostKOdd(nums,k)-atMostKOdd(nums,k-1);
      
    }

    
    public int atMostKOdd(int arr[],int k){
        int n=arr.length;
        int count=0;
        int odd=0;
        int l=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<n;r++){
            if(arr[r]%2!=0) odd++;

            while(odd>k){
                if(arr[l]%2!=0) odd--;
                l++;
            }

            count+=(r-l+1);

        }


        return count;
    }
}