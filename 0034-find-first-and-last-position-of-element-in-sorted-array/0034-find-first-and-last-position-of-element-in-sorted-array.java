class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=Integer.MAX_VALUE;
        int last=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(i>first){
                    last=Math.max(i,last);
                }
                first=Math.min(i,first);
            }
            
        }


        int arr[]=new int[2];
        if(first==Integer.MAX_VALUE && last==Integer.MIN_VALUE){
            Arrays.fill(arr,-1);
            return arr;
        }else if(first==Integer.MAX_VALUE){
            first=last;
        }
        else if(last==Integer.MIN_VALUE){
            last=first;
        }

        arr[0]=first;
        arr[1]=last;

        return arr;


        
    }
}