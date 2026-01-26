class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int max=1;
        int min=1;
        
        int ans=arr[0];
        
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                int temp=min;
                min=max;
                max=temp;
            }
            
            max=Math.max(arr[i],max*arr[i]);
            min=Math.min(arr[i],min*arr[i]);
            
            ans=Math.max(ans,max);
        }
        
        return ans;
    }
}